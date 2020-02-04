package com.banking.server.handlers;

import com.banking.server.TManagerService;
import com.banking.server.dao.Account;
import com.banking.server.dao.Customer;
import com.banking.server.repositories.AccountRepository;
import com.banking.server.repositories.CustomerRepository;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceHandler implements TManagerService.Iface {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    AccountRepository accountRepository;
    @Override
    public String addCustomer(String customerAccountNumber, String managerAccountNumber) throws TException {
        Customer acc=customerRepository.findByAccountNumber(customerAccountNumber);
        acc.setVerified(true);
        acc.setVerifiedByManagerAccountNo(managerAccountNumber);
        customerRepository.save(acc);
        return "Account verified";
    }

    @Override
    public String removeCustomer(String accountNumber) throws TException {

        Account acc = accountRepository.findByAccountNumber(accountNumber);
        acc.setActive(false);
        accountRepository.save(acc);
        return "Accounnt is inactive";
    }

    @Override
    public String deposit(String accountNumber, double amount) throws TException {
        Customer acc =customerRepository.findByAccountNumber(accountNumber);
        double p=acc.getBalance();
        double q=p+amount;
        acc.setBalance(q);
        customerRepository.save(acc);
        return "amount is deposited";
    }
}
