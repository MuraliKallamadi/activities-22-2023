package com.npci.LoanApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.LoanApplication.entities.LoanTable;

public interface LoanRepository extends JpaRepository<LoanTable,Integer>{

}
