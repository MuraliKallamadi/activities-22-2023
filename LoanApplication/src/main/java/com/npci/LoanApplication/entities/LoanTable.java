package com.npci.LoanApplication.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "loan_table")
public class LoanTable {

	public LoanTable(int loan_id, String loan_type) {
		super();
		this.loan_id = loan_id;
		this.loan_type = loan_type;
	}
	public LoanTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int loan_id;
	private String loan_type;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "loan_ref")
	
	
	public int getLoan_id() {
		return loan_id;
	}
	public void setLoan_id(int loan_id) {
		this.loan_id = loan_id;
	}
	public String getLoan_type() {
		return loan_type;
	}
	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}
	@Override
	public String toString() {
		return "LoanTable [loan_id=" + loan_id + ", loan_type=" + loan_type + "]";
	}
}
