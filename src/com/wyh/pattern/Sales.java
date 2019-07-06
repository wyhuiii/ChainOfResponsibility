package com.wyh.pattern;

public class Sales extends PriceHandler{

	//销售人员的审批处理
	@Override
	public void proccessDiscount(float discount) {

		//销售人员可以处理
		if(discount < 0.05) {
			//做具体的处理。。。此处以打印输出做演示
			System.out.println("销售人员批准折扣："+discount);
		}else {
			//当前级别无法处理请求，将请求传递给后继(this.proccessor是当前对象的后继，后继也是个审批人，就继续调用方法进行处理)
			this.proccessor.proccessDiscount(discount);
		}
	}

	
}
