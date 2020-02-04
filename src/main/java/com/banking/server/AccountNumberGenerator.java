package com.banking.server;

import com.banking.server.repositories.AccountRepository;
import com.banking.server.repositories.CustomerRepository;
import com.banking.server.repositories.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountNumberGenerator {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    ManagerRepository managerRepository;

    @Autowired
    CustomerRepository customerRepository;

    public String generateAccountNumber(String branchCode, String role) {
        long size=0;
        String newAccountNumber="";
        String newRole = role.toLowerCase();
        if(newRole.equals("customer")){
            size=customerRepository.findAll().size();
            //System.out.println(accountRepository.findAll().size());
            size++;
            newAccountNumber = "00";
            newAccountNumber+=branchCode;
            newAccountNumber+=String.format("%06d", size);
        }
        else if(newRole.equals("manager")) {
            size=managerRepository.countAllByBranchCode(branchCode);
            size++;
            newAccountNumber = "01";
            newAccountNumber += branchCode;
            newAccountNumber+=String.format("%06d", size);
        }
        return newAccountNumber;

    }


}
