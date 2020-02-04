package com.banking.server.handlers;

import com.banking.server.TCustomer;
import com.banking.server.TCustomerService;
import com.banking.server.TTransaction;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceHandler implements TCustomerService.Iface {
    @Override
    public String addAccountRequest(TCustomer tCustomer) throws TException {
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
        return null;
    }
}
