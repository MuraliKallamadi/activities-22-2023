package com.npci.LoanApplication.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "loan_application_table")
public class LoanApplicationTable {
	
	
	public LoanApplicationTable(int application_id, int customer_id, int loan_id, String status, int custRef,
			int loanRef) {
		super();
		this.application_id = application_id;
		this.customer_id = customer_id;
		this.loan_id = loan_id;
		this.status = status;
		this.custRef = custRef;
		this.loanRef = loanRef;
	}

	public LoanApplicationTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int application_id;
	private int customer_id;
	private int loan_id;
	private String status;
	@Column(name="cust_ref")
	private int custRef;
	
	@Column(name="loan_ref")
	private int loanRef;

	public int getApplication_id() {
		return application_id;
	}

	public void setApplication_id(int application_id) {
		this.application_id = application_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getLoan_id() {
		return loan_id;
	}

	public void setLoan_id(int loan_id) {
		this.loan_id = loan_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCustRef() {
		return custRef;
	}

	public void setCustRef(int custRef) {
		this.custRef = custRef;
	}

	public int getLoanRef() {
		return loanRef;
	}

	public void setLoanRef(int loanRef) {
		this.loanRef = loanRef;
	}

	@Override
	public String toString() {
		return "LoanApplicationTable [application_id=" + application_id + ", customer_id=" + customer_id + ", loan_id="
				+ loan_id + ", status=" + status + ", custRef=" + custRef + ", loanRef=" + loanRef + "]";
	}
	
	
}
