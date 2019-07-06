package com.wyh.pattern;

//价格处理器：每个PriceHandler都有一个后继，除了最高级别无后继。
public abstract class PriceHandler {
	
	protected PriceHandler proccessor;

	public void setProccessor(PriceHandler proccessor) {
		this.proccessor = proccessor;
	}
	
	//抽象方法，不同的审批人做具体的实现
	public abstract void proccessDiscount(float discount);

}
