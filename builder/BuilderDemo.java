package com.liuhongbo.designmode.builder;

public class BuilderDemo {
	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.Construct();
		Productor productor = builder.GetProduct();
		System.out.println(productor.getPartA().getName() + " "
				+ productor.getPartB().getName() + " "
				+ productor.getPartC().getName());
	}
}
