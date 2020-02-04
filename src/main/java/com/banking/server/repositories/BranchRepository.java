package com.banking.server.repositories;

import com.banking.server.dao.Branch;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.cdi.MongoRepositoryExtension;

public interface BranchRepository extends MongoRepository<Branch, String> {

    Branch findBranchByBranchNameAndBranchCity(String branchName,String branchCity);
}
