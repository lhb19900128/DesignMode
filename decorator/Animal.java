package com.liuhongbo.designmode.decorator;

abstract public class Animal {
	private String name = null;
	
	public Animal(){}
	
	public Animal(String namesString) {
		this.name = namesString;
	}
	
	abstract void Show();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
