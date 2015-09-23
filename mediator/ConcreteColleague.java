package com.liuhongbo.designmode.mediator;

public class ConcreteColleague extends Colleague {
	private String name;

	public ConcreteColleague(Mediator mediator, String name) {
		super(mediator);
		this.setName(name);
	}

	@Override
	public void send(String message) {
		mediator.send(message, this);
	}

	@Override
	public void notifyOther(String message) {
		System.out.println(name + " receive message:" + message);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
