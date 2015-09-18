package com.liuhongbo.designmode.simplefactory;

public class OperationFactory{
	public static Operation createOperation(String str) throws DefaultException{
		Operation operation = null;
		switch (str.trim().charAt(0)) {
		case '+':
			operation = new OperationAdd();
			break;
		case '-':
			operation = new OperationSub();
			break;
		case '*':
			operation = new OperationMul();
			break;
		case '/':
			operation = new OperationDiv();
			break;
		default:
			throw new DefaultException("请输入正确的操作符");
		}
		return operation;
	}
}


