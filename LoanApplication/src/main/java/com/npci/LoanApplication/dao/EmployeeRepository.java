package com.npci.LoanApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.LoanApplication.entities.EmployeeTable;

public interface EmployeeRepository extends JpaRepository<EmployeeTable, Integer> {

}
