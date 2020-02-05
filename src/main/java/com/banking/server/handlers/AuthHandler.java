package com.banking.server.handlers;

import com.banking.server.TAuthService;
import com.banking.server.dao.Account;
import com.banking.server.repositories.AccountRepository;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthHandler implements TAuthService.Iface {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public String login(String accountNumber, String password) throws TException {
        Account account = accountRepository.findByAccountNumber(accountNumber);
        if(account!=null && account.getPassword().equals(password)){
            account.setLoggedIn(true);
            accountRepository.save(account);
            System.out.println("user logged in");
            return "user log in successful";
        }
        return "user log in failed";
    }

    @Override
    public String logout(String accountNumber) throws TException {
        System.out.println(accountNumber);
        Account account = accountRepository.findByAccountNumber(accountNumber);
        if(account!=null && account.isLoggedIn()==true){
            account.setLoggedIn(false);
            accountRepository.save(account);
            System.out.println("user logged out");
            return "user log out successful";
        }
        return "user not logged in";
    }
}
