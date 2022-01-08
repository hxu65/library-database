package com.cs425.web.model;

public class address {
	

	private String M_ID;
	private String street;
	private String apt_num;
	private String city;
	private String state;
	private String zip;

	public String getM_ID() {
		return M_ID;
	}
	public void setM_ID(String m_ID) {
		M_ID = m_ID;
	}
	


	public String getApt_num() {
		return apt_num;
	}
	public void setApt_num(String apt_num) {
		this.apt_num = apt_num;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "adress[ M_ID= "+M_ID+", street="+street+", apt_num="+apt_num+", city="+city+", state"+ state +", zip="+zip+"]";
	}
}
