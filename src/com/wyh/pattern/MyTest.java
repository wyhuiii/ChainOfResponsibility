package com.wyh.pattern;

public class MyTest {

	public static void main(String[] args) {
		//运行时，只需要创建客户对象，传入申请的折扣，并发出请求，后面的事情交给审批人处理
		Customer customer = new Customer();
		//customer.setDiscount(0.04f);
		//customer.setDiscount(0.055f);
		//customer.setDiscount(0.065f);
		customer.setDiscount(0.075f);
		customer.request(HandlerFactory.createHandler());
	}
}
