package com.wyh.pattern;

/**
* <p>Title: HandlerFactory</p>  
* <p>Description: 审批人工厂（产生的都是PriceHandler的处理器的实现类对象）</p>  
* @author wyh
* @date Jul 6, 2019
 */
public class HandlerFactory {
	
	public static PriceHandler createHandler() {
		//假设有三个级别可以处理申请
		Sales sales = new Sales();
		Manager manager = new Manager();
		Ceo ceo = new Ceo();
		
		//设置每个级别的后继（体现责任链模式的链式特点）
		sales.setProccessor(manager);
		manager.setProccessor(ceo);
		
		//初始返回最低级别的处理者，级别不够的时候向上级申请
		return sales;
	}

}
