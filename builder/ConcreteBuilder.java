package com.liuhongbo.designmode.builder;

public class ConcreteBuilder extends Builder {
	private Productor productor;

	public ConcreteBuilder() {
		// TODO Auto-generated constructor stub
		productor = new Productor();
	}
	
	@Override
	public void BuildPartA() {
		// TODO Auto-generated method stub
		Part part = new Part("PartA");
		productor.setPartA(part);
	}

	@Override
	public void BuildPartB() {
		// TODO Auto-generated method stub
		Part part = new Part("PartB");
		productor.setPartB(part);
	}

	@Override
	public void BuildPartC() {
		// TODO Auto-generated method stub
		Part part = new Part("PartC");
		productor.setPartC(part);
	}
	
	public Productor GetProduct(){
		return this.productor;
	}

}
