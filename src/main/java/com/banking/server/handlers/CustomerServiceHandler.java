package com.banking.server.handlers;

import com.banking.server.TCustomer;
import com.banking.server.TCustomerService;
import com.banking.server.TTransaction;

import org.apache.thrift.TException;
import org.springframework.stereotype.Service;
import com.banking.server.dao.Account;
import com.banking.server.dao.Customer;
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

    @Override
    public String addAccountRequest(TCustomer tCustomer) throws TException {
        Customer customer = new Customer(tCustomer.branchCode,tCustomer.username,tCustomer.transactions);
        //Account account = new Account();
        customerRepository.save(customer);
        return null;
    }

    @Override
    public String withdraw(String accountNumber, double amount) throws TException {
        return null;
    }

    @Override
    public String sendMoney(String debitAccountNumber, String creditAccountNumber, double amount) throws TException {

        return null;
    }

    @Override
    public List<TTransaction> getAllTransactions(String accountNumber) throws TException {
        return customerRepository.findByAccountNumber(accountNumber).getTransactions();

    }
}
