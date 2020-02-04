package com.banking.server.repositories;

import com.banking.server.dao.Manager;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ManagerRepository extends MongoRepository<Manager, String> {

    Long countAllByBranchCode(String branchCode);
    Manager findByAccountNumber(String accountNumber);
}
