package com.liuhongbo.designmode.interpreter;

public class Scale extends Expression {

	@Override
	public void excute(String key, double value) {
		switch ((int)value) {
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("����");
			break;
		case 3:
			System.out.println("����");
			break;
		default:
			break;
		}
	}

}
