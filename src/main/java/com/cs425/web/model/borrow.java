package com.cs425.web.model;

import java.sql.Date;

public class borrow {
	private String D_ID;
	private String Copy_ID;
	private String M_ID;
	private String reserve_date;
	private String return_date;
	private int load_period;
	private String IsReturned;
	
	public borrow() {
		
	}
	
	 public borrow(String id) {
	        this.D_ID = id;
	    }
	 
    public borrow(String D_ID, String Copy_ID, String M_ID, String reserve_date, String return_date,  int load_period, String IsReturned ) {
    	this.D_ID = D_ID;
    	this.Copy_ID = Copy_ID;
        this.M_ID = M_ID;
        this.reserve_date = reserve_date;
        this.return_date = return_date;
        this.load_period = load_period;
        this.IsReturned = IsReturned;
        
        
    }
	
	public String getD_ID() {
		return D_ID;
	}
	public void setD_ID(String d_ID) {
		D_ID = d_ID;
	}
	public String getCopy_ID() {
		return Copy_ID;
	}
	public void setCopy_ID(String Copy_ID) {
		this.Copy_ID = Copy_ID;
	}
	public String getM_ID() {
		return M_ID;
	}
	public void setM_ID(String m_ID) {
		M_ID = m_ID;
	}
	public String getReserve_date() {
		return reserve_date;
	}
	public void setReserve_date(String reserve_date) {
		this.reserve_date = reserve_date;
	}
	public String getReturn_date() {
		return return_date;
	}
	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}
	public int load_period() {
		return load_period;
	}
	public void setload_period(int load_period) {
		this.load_period = load_period;
	}
	public String getIsReturned() {
		return IsReturned;
	}
	public void setIsReturned(String IsReturned) {
		this.IsReturned = IsReturned;
	}
	@Override
	public String toString() {
		return "borrow[D_ID= " + D_ID + ", M_ID= " + M_ID + ", Copy_ID = "+ Copy_ID + ", reserve_date="+reserve_date+", return_date="+return_date+", load_period = " + load_period + ", IsReturned = "+ IsReturned +"  ]";
	}
	

}
