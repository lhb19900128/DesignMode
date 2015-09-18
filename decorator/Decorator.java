package com.liuhongbo.designmode.decorator;

abstract public class Decorator extends Animal{
	private Animal animal;
	
	public Decorator(){}
	
	public Decorator(Animal animal){
		this.animal = animal;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
}
