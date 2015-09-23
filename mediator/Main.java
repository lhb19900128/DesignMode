package com.liuhongbo.designmode.mediator;

public class Main {
	public static void main(String[] args){
		Mediator mediator = new ConcreteMediator();
		Colleague colleague1 = new ConcreteColleague(mediator, "xiaoping");
		Colleague colleague2 = new ConcreteColleague(mediator,"xiaobo");
		mediator.setColleague(colleague1,colleague2);
		colleague1.send("hello world");
	}
}
