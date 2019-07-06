package com.wyh.pattern;

public class Ceo extends PriceHandler{

	//最高级别处理者，没有后继
	@Override
	public void proccessDiscount(float discount) {

		if(discount < 0.07) {
			System.out.println("CEO通过了审批");
		}else {
			System.out.println("拒绝申请");
		}
	}

	
}
