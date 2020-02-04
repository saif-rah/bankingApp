package com.banking.server.handlers;

import com.banking.server.TManagerService;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceHandler implements TManagerService.Iface {
    @Override
    public String addCustomer(String customerAccountNumber, String managerAccountNumber) throws TException {

        return null;
    }

    @Override
    public String removeCustomer(String accountNumber) throws TException {
        return null;
    }

    @Override
    public String deposit(String accountNumber, double amount) throws TException {
        return null;
    }
}
