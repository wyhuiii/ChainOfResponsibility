package com.wyh.pattern;

/**
* <p>Title: Customer</p>  
* <p>Description: 客户实体
* 属性：想要申请的折扣
* 方法：向审批人提出申请（客户不关心该申请经过了哪些级别，也不关心最后由谁批准了）
* </p>  
* @author wyh
* @date Jul 6, 2019
 */
public class Customer {
	
	private float discount;

	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	//在传入审批人参数时，审批人直接由审批人工厂创建
	public void request(PriceHandler proccessor) {
		//有了审批人之后，调用方法处理具体的审批流程
		proccessor.proccessDiscount(discount);
	}

}
