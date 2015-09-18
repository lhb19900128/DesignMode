package com.liuhongbo.designmode.decorator;

public class Tshit extends Decorator{
	private Animal animal;
	
	public Tshit(Animal animal){
		this.animal = animal;
	}

	@Override
	void Show() {
		// TODO Auto-generated method stub
		animal.Show();
		System.out.print(" Tshit");
	}
}
