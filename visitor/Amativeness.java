package com.liuhongbo.designmode.visitor;

public class Amativeness implements Action {

	@Override
	public void getManConclusion() {
		System.out.println("man amativeness");
	}

	@Override
	public void getWomanConclusion() {
		System.out.println("woman amativeness");
	}

}
