package com.liuhongbo.designmode.mediator;

public abstract class Mediator {
	public abstract void send(String message, Colleague colleague);

	public abstract void setColleague1(Colleague colleague1);

	public abstract void setColleague2(Colleague colleague2);
	
	public abstract void setColleague(Colleague colleague1,Colleague colleague2);
}
