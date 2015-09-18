package com.liuhongbo.designmode.factorymethod;

public class FactoryDiv extends IFactory{

	@Override
	public Operation CreateOperation() {
		// TODO Auto-generated method stub
		return new OperationDiv();
	}

}
