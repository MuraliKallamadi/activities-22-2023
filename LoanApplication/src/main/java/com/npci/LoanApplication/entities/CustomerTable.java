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
@Table(name = "customer_table")
public class CustomerTable {
	public CustomerTable(int customer_id, String firstname, String lastname, String email_id, String password,
			long phone, String pan) {
		super();
		this.customer_id = customer_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email_id = email_id;
		this.password = password;
		this.phone = phone;
		this.pan = pan;
	}
	public CustomerTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int customer_id;
	
	private String firstname;
	private String lastname;
	private String email_id;
	private String password;
	private long phone;
	private String pan;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cust_ref")
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	@Override
	public String toString() {
		return "CustomerTable [customer_id=" + customer_id + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email_id=" + email_id + ", password=" + password + ", phone=" + phone + ", pan=" + pan + "]";
	}

}
