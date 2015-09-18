package com.liuhongbo.designmode.factorymethod;

public class OperationAdd extends Operation{

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		return getOperateNumA() + getOperateNumB();
	}
	
}
