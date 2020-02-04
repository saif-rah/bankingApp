package com.banking.server.handlers;

import com.banking.server.TAuthService;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

@Service
public class AuthHandler implements TAuthService.Iface {

    @Override
    public String login(String accountNumber, String password) throws TException {
        return null;
    }

    @Override
    public String logout(String accountNumber) throws TException {
        return null;
    }
}
