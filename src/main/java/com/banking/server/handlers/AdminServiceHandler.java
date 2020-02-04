package com.banking.server.handlers;

import com.banking.server.TAdminService;
import com.banking.server.TManager;
import org.apache.thrift.TException;
import com.banking.server.AccountNumberGenerator;
import com.banking.server.TAdminService;
import com.banking.server.TManager;
import com.banking.server.dao.Account;
import com.banking.server.dao.Branch;
import com.banking.server.dao.Manager;
import com.banking.server.repositories.AccountRepository;
import com.banking.server.repositories.BranchRepository;
import com.banking.server.repositories.ManagerRepository;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServiceHandler implements TAdminService.Iface {

    @Autowired
    private ManagerRepository managerRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private BranchRepository branchRepository;

    @Override
    public String addManager(String username, String password, String branchCode) throws TException {


        AccountNumberGenerator accountNumberGenerator=new AccountNumberGenerator();
        String generatedAccountNumber = (String) accountNumberGenerator.generateAccountNumber(branchCode,"manager");
        managerRepository.save(new Manager(generatedAccountNumber,branchCode,username));
        accountRepository.save(new Account(generatedAccountNumber,"manager",password,false));
        return generatedAccountNumber;

    }

    @Override
    public String removeManager(String accountNumber) throws TException {
        Account curAccount = accountRepository.findByAccountNumber(accountNumber);
        curAccount.setActive(false);
//        accountRepository.deleteByAccountNumber(accountNumber);
        accountRepository.save(curAccount);
        return "Manager removed";
    }

    @Override
    public List<TManager> getAllManagers() throws TException {

        List<Account> managerList = new ArrayList<Account>();
        managerList = accountRepository.findAllByRoleAndIsActive("manager", true);

        List<TManager> tManagerList = new ArrayList<TManager>();
        for(Account managerAccount : managerList){
            Manager managerDetails = managerRepository.findByAccountNumber(managerAccount.getAccountNumber());
            tManagerList.add(new TManager(managerAccount.getAccountNumber(), managerDetails.getBranchCode(), managerDetails.getUsername()));
        }

        return tManagerList;
    }

    @Override
    public String addBranch(String branchName, String branchCity) throws TException {

        long size = branchRepository.count();

        branchRepository.save(new Branch(String.format("%04d",size+1),branchName,branchCity,0));

        return String.format("%04d",size+1);
    }

    @Override
    public String getBranchCode(String branchName, String branchCity) throws TException {

        Branch branch=branchRepository.findBranchByBranchNameAndBranchCity(branchName,branchCity);
        return branch.getBranchCode();

    }

    @Override
    public String removeBranch(String branchCode) throws TException {

        return null;
    }
}
