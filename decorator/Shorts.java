package com.liuhongbo.designmode.decorator;

public class Shorts extends Decorator{
	private Animal animal;
	
	public Shorts(Animal animal){
		this.animal = animal;
	}

	@Override
	void Show() {
		// TODO Auto-generated method stub
		animal.Show();
		System.out.print(" Shorts");
	}


}
