package com.nit.bean;

public class Customer {
	
	private int cid;
	private String cname;
	private String cadd;
	private float billAmt;
	
	
	
	/*
	 * public Customer(int cid, String cname, String cadd, float billAmt) {
	 * System.out.println("Customer.Customer ::  0 param constructor"); this.cid =
	 * cid; this.cname = cname; this.cadd = cadd; this.billAmt = billAmt; }
	 * 
	 */


	public void setCid(int cid) {
		this.cid = cid;
	}



	public void setCname(String cname) {
		this.cname = cname;
	}



	public void setCadd(String cadd) {
		this.cadd = cadd;
	}



	public void setBillAmt(float billAmt) {
		this.billAmt = billAmt;
	}



	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cadd=" + cadd + ", billAmt=" + billAmt + "]";
	}
	
	

}
