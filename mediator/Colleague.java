package com.liuhongbo.designmode.mediator;

public abstract class Colleague {
	protected Mediator mediator;
	
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
	
	public abstract void send(String message);
	public abstract void notifyOther(String message);
}	
