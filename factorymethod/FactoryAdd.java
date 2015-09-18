package com.liuhongbo.designmode.factorymethod;

public class FactoryAdd extends IFactory{

	@Override
	public Operation CreateOperation() {
		// TODO Auto-generated method stub
		return new OperationAdd();
	}
	
}
