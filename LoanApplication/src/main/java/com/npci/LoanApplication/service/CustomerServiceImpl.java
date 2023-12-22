package com.npci.LoanApplication.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.npci.LoanApplication.dao.CustomerRepository;
import com.npci.LoanApplication.dao.EmployeeRepository;
import com.npci.LoanApplication.dao.LoanApplicationRepository;
import com.npci.LoanApplication.dao.LoanRepository;
import com.npci.LoanApplication.entities.CustomerTable;
import com.npci.LoanApplication.entities.EmployeeTable;
import com.npci.LoanApplication.entities.LoanApplicationTable;
import com.npci.LoanApplication.entities.LoanTable;






@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private  CustomerRepository dao;
	
	@Autowired
	private  LoanApplicationRepository loanDao;
	
	@Autowired
	private  EmployeeRepository empDao;
	
	@Autowired
	private  LoanRepository ldao;
	
	@Override
	public CustomerTable store(CustomerTable customer) {
	
		CustomerTable savedEntity= dao.save(customer);
		return savedEntity;
		
	}



	@Override
	public LoanApplicationTable store(LoanApplicationTable loan) {
		
		LoanApplicationTable saveloan = loanDao.save(loan);
		// TODO Auto-generated method stub
		return saveloan;
	}



	@Override
	public EmployeeTable store(EmployeeTable employee) {
		EmployeeTable saveemp = empDao.save(employee);
		
		return saveemp;
	}



	@Override
	public List<CustomerTable> getByMailId(String email) {
		// TODO Auto-generated method stub
		return dao.getByMailId(email);
	}



	@Override
	public LoanApplicationTable saveLoan(LoanApplicationTable loan) {
		LoanApplicationTable loans = loanDao.save(loan);
		return loans;
		}



	@Override
	public List<LoanTable> getAllLoans() {
		List<LoanTable> loans = ldao.findAll();
		System.out.println(loans);
		return loans;
	}
	@Override
	public LoanTable  getLoanType(int loanId) {
		// TODO Auto-generated method stub
		LoanTable loan = ldao.getById(loanId);
		return loan;
	}






	



	





	
	
	

}
