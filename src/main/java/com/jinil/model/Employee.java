package com.jinil.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Column
	private String address;

	@Column
	private String emailid;
	@Column
	private String fname;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private Date joiningdate;
	@Column
	private String lname;

	public String getAddress() {
		return address;
	}

	public String getEmailid() {
		return emailid;
	}

	public String getFname() {
		return fname;
	}

	public int getId() {
		return id;
	}

	public Date getJoiningdate() {
		return joiningdate;
	}

	public String getLname() {
		return lname;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + ", emailid=" + emailid + ", fname=" + fname + ", id=" + id
				+ ", joiningdate=" + joiningdate + ", lname=" + lname + "]";
	}

}
