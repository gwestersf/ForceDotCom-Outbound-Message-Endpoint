package com.heroku.crm.model;

import java.util.Date;

public class Payment {
	private Double amount;
	private String remark;
	private Date date;
	
	public Payment() { }
	
	public Payment(Double amount, String remark, Date date) {
		super();
		this.amount = amount;
		this.remark = remark;
		this.date = date;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
