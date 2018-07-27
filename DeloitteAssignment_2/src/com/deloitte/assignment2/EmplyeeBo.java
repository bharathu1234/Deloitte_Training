package com.deloitte.assignment2;

public class EmplyeeBo {

	public EmplyeeBo() {
	}

	void CalincomeTax(EmplyeeVo e1) {
		double annualincome = e1.getAnnualincome();
		double tax = 0;
		if (annualincome > 1000000) {
			tax = 0.4 * annualincome;
		} else if (annualincome > 500000) {
			tax = 0.3 * annualincome;
		} else {
			tax = 0.2 * annualincome;
		}
		e1.setIncometa(tax);

	}

}