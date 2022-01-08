package com.cs425.web.model;

public class Librarians {

	private String ID;
	private String name;
	private String password;
	private String email;
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void getEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Librarians [ID=" + ID + ", name=" + name + ", password=" + password + " , email = "+ email +"]";
	}
}
