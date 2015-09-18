package com.liuhongbo.designmode.factorymethod;

abstract public class Operation {
	private double operateNumA = 0;
	private double operateNumB = 0;

	public Operation(){}
	
	public Operation(double dOperateNumA,double dOperateNumB){
		this.operateNumA = dOperateNumA;
		this.operateNumB = dOperateNumB;
	}
	
	public double getOperateNumA() {
		return operateNumA;
	}

	public void setOperateNumA(double operateNumA) {
		this.operateNumA = operateNumA;
	}

	public double getOperateNumB() {
		return operateNumB;
	}

	public void setOperateNumB(double operateNumB) {
		this.operateNumB = operateNumB;
	}

	abstract public double getResult();

}
