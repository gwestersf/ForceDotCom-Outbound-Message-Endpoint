package com.heroku.crm;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.heroku.crm.model.Payment;

@WebService()
public class CrmService {

	@WebMethod
	public Payment getPaymentInfo() {
		return new Payment(250d, "on time", new Date(System.currentTimeMillis()));
	}
}
