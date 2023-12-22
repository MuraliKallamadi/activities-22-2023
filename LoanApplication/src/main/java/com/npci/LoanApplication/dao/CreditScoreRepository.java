package com.npci.LoanApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.LoanApplication.entities.CreditScoreTable;

public interface CreditScoreRepository extends JpaRepository<CreditScoreTable, String>{

}
