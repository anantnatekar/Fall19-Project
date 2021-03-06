package com.example.entity;

import org.springframework.stereotype.Component;

@Component
public class Participator {
	private String fname;
	private String email;
	private String lname;
	private String minit;
	private String phone;
	private String affiliation;
	private String password;
	
	public Participator()
	{
		this.email="";
		this.fname="";
		this.lname="";
		this.minit="";
		this.phone="";
		this.affiliation="";
		this.password="";
	}
	
	public Participator(String fname, String email, String lname, String minit, String phone, String affiliation, String password)
	{
		this.fname=fname;
		this.email=email;
		this.lname=lname;
		this.minit=minit;
		this.phone=phone;
		this.affiliation=affiliation;
		this.password=password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMinit() {
		return minit;
	}

	public void setMinit(String minit) {
		this.minit = minit;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Participator [fname=" + fname + ", email=" + email + ", lname=" + lname + ", minit=" + minit
				+ ", phone=" + phone + ", affiliation=" + affiliation + ", password=" + password + "]";
	}
	
}
