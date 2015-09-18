package com.liuhongbo.designmode.decorator;

public class Dog extends Animal{

	public Dog(){}
	
	public Dog(String namesString) {
		// TODO Auto-generated constructor stub
		super(namesString);
	}
	
	@Override
	void Show() {
		// TODO Auto-generated method stub
		System.out.print(getName());
	}
	
}
