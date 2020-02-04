package com.banking.server.handlers;

import com.banking.server.AccountNumberGenerator;
import com.banking.server.TCustomer;
import com.banking.server.TCustomerService;
import com.banking.server.TTransaction;

import org.apache.thrift.TException;
import org.springframework.stereotype.Service;
import com.banking.server.dao.Account;
import com.banking.server.dao.Customer;
import com.banking.server.repositories.AccountRepository;
import com.banking.server.repositories.CustomerRepository;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.DTDConstants;
import java.util.List;

@Service
public class CustomerServiceHandler implements TCustomerService.Iface {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    AccountRepository accountRepository;

    @Override
    public String addAccountRequest(TCustomer tCustomer) throws TException {
        AccountNumberGenerator accountNumberGenerator = new AccountNumberGenerator();
        String accountNumber = accountNumberGenerator.generateAccountNumber(tCustomer.branchCode, "customer");
        Customer customer = new Customer(accountNumber, tCustomer.branchCode, tCustomer.username, tCustomer.transactions);
        customerRepository.save(customer);
        Account account = new Account(accountNumber, "customer", tCustomer.password, false);
        accountRepository.save(account);
        return null;
    }

    @Override
    public String withdraw(String accountNumber, double amount) throws TException {
        try {
            Customer customer = customerRepository.findByAccountNumber(accountNumber);
            if (customer != null) {
                Account account = accountRepository.findByAccountNumber(accountNumber);
                if (account.isActive() && account.isLoggedIn()) {
                    if (customer.getBalance() >= amount) {
                        customer.setBalance(customer.getBalance() - amount);
                        customerRepository.save(customer);
                        return "please collect your money";
                    } else {
                        return "you don't have enough balance";
                    }
                } else {
                    return "please login first";
                }
            }
        } catch (Exception e) {
            return "Account not found";
        }
        return null;
    }

    @Override
    public String sendMoney(String debitAccountNumber, String creditAccountNumber, double amount) throws TException {

        try {
            Customer debitCustomer = customerRepository.findByAccountNumber(debitAccountNumber);
            Customer creditCustomer = customerRepository.findByAccountNumber(creditAccountNumber);
            if (creditCustomer != null && debitCustomer!=null ) {
                Account account = accountRepository.findByAccountNumber(debitAccountNumber);
                if (account.isActive() && account.isLoggedIn()) {
                    if (debitCustomer.getBalance() >= amount) {
                        debitCustomer.setBalance(debitCustomer.getBalance() - amount);
                        creditCustomer.setBalance(creditCustomer.getBalance()+amount);
                        TTransaction tTransaction = new TTransaction(debitAccountNumber,creditAccountNumber,amount);
                        debitCustomer.setTransactions(tTransaction);
                        creditCustomer.setTransactions(tTransaction);
                        customerRepository.save(debitCustomer);
                        customerRepository.save(creditCustomer);
                        return "Transaction done";
                    } else {
                        return "you don't have enough balance";
                    }
                } else {
                    return "please login first";
                }
            }
        } catch (Exception e) {
            return "Account not found";
        }

        return null;
    }

    @Override
    public List<TTransaction> getAllTransactions(String accountNumber) throws TException {
        return customerRepository.findByAccountNumber(accountNumber).getTransactions();

    }
}
