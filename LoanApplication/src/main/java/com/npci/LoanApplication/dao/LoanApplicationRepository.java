package com.npci.LoanApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.LoanApplication.entities.LoanApplicationTable;

public interface LoanApplicationRepository extends JpaRepository<LoanApplicationTable, Integer> {

}
