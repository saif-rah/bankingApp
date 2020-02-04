package com.banking.server.repositories;

import com.banking.server.dao.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AccountRepository extends MongoRepository<Account, String> {
    public Account findByAccountNumber(String accountNumber);
    public void deleteByAccountNumber(String accountNumber);
    public List<Account> findAllByRoleAndIsActive(String role, boolean isActive);
}
