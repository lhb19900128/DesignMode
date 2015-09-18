package com.liuhongbo.designmode.factorymethod;

public class OperationMul extends Operation{

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		return getOperateNumA() * getOperateNumB();
	}

}
