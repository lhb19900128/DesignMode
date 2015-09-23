package com.liuhongbo.designmode.flyweight;

public class ConcreteWebsite extends Website {

	private String name;

	public ConcreteWebsite(String name) {
		this.name = name;
	}

	@Override
	public void use(User user) {
		System.out.println("website category:" + name + user.toString());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
