package com.liuhongbo.designmode.factorymethod;

public class OperationDiv extends Operation{

	@Override
	public double getResult() throws ArithmeticException{
		double result = 0;
		if (getOperateNumB() < 0.00001d && getOperateNumB() > -0.00001d) {
			throw new ArithmeticException("除数不能为0！");
		}
		result = getOperateNumA() / getOperateNumB();
		return result;
	}

}
