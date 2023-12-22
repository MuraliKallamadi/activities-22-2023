package com.npci.LoanApplication.service;

import java.util.List;

import com.npci.LoanApplication.entities.CustomerTable;
import com.npci.LoanApplication.entities.EmployeeTable;
import com.npci.LoanApplication.entities.LoanApplicationTable;
import com.npci.LoanApplication.entities.LoanTable;

public interface CustomerService {
	

	//Customer Registration 
		 CustomerTable store(CustomerTable customer);
		
	//Apply Loans
		 
		 LoanApplicationTable store(LoanApplicationTable loan);
		 
	
		//Employee Details 
		 EmployeeTable store(EmployeeTable employee); 
		 
		 
		 public List<CustomerTable> getByMailId(String email);
		 
		 public LoanApplicationTable saveLoan(LoanApplicationTable loan);
		 
		 public List<LoanTable> getAllLoans();
		 public LoanTable  getLoanType(int loanId) ;
	
}
