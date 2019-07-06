package com.wyh.pattern;

public class Manager extends PriceHandler{

	@Override
	public void proccessDiscount(float discount) {

		if(discount < 0.06) {
			System.out.println("经理批准了申请:"+discount);
		}else {
			this.proccessor.proccessDiscount(discount);
		}
	}

	
}
