package com.liuhongbo.designmode.decorator;

public class Cat extends Animal{

	public Cat(){}
	
	public Cat(String namesString) {
		// TODO Auto-generated constructor stub
		super(namesString);
	}
	
	@Override
	void Show() {
		// TODO Auto-generated method stub
		System.out.println(getName());
	}
	
}