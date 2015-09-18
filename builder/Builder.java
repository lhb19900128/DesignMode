package com.liuhongbo.designmode.builder;

public abstract class Builder {
	public abstract void BuildPartA();

	public abstract void BuildPartB();

	public abstract void BuildPartC();
	
	public abstract Productor GetProduct();
}
