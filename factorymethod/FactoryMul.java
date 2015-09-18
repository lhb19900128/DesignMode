package com.liuhongbo.designmode.factorymethod;

public class FactoryMul extends IFactory{

	@Override
	public Operation CreateOperation() {
		// TODO Auto-generated method stub
		return new OperationMul();
	}
	
}
