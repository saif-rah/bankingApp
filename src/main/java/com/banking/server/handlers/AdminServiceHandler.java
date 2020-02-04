package com.banking.server.handlers;

import com.banking.server.TAdminService;
import com.banking.server.TManager;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceHandler implements TAdminService.Iface {
    @Override
    public String addManager(String username, String password, String branchCode) throws TException {
        return null;
    }

    @Override
    public String removeManager(String accountNumber) throws TException {
        return null;
    }

    @Override
    public List<TManager> getAllManagers() throws TException {
        return null;
    }

    @Override
    public String addBranch(String branchName, String branchCity) throws TException {
        return null;
    }

    @Override
    public String getBranchCode(String branchName, String branchCity) throws TException {
        return null;
    }

    @Override
    public String removeBranch(String branchCode) throws TException {
        return null;
    }
}
