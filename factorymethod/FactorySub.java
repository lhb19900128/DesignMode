package com.liuhongbo.designmode.factorymethod;

public class FactorySub extends IFactory{

	@Override
	public Operation CreateOperation() {
		// TODO Auto-generated method stub
		return new OperationSub();
	}
	
}
