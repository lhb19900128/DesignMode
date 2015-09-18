package com.liuhongbo.designmode.decorator;

public class DecoratorDemo {
	public static void main(String[] args){
		Animal animal = new Dog("Dog");
		Shorts shorts = new Shorts(animal);
		Tshit tshit = new Tshit(shorts);
		tshit.Show();
	}
}
