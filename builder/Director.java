package com.liuhongbo.designmode.builder;

public class Director {
	private Builder builder;
	
	public Director(Builder builder){
		this.builder = builder;
	}

	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public void Construct(){
		builder.BuildPartA();
		builder.BuildPartB();
		builder.BuildPartC();
	}
	
}
