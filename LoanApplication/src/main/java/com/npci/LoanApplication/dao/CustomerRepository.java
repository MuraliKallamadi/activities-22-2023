package com.npci.LoanApplication.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.npci.LoanApplication.entities.CustomerTable;

public interface CustomerRepository extends JpaRepository<CustomerTable, Integer> {

	@Query("select cust from CustomerTable cust where cust.email_id=?1")
	public List<CustomerTable> getByMailId(String mailId);
}
