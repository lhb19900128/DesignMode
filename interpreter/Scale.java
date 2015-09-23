package com.liuhongbo.designmode.interpreter;

public class Scale extends Expression {

	@Override
	public void excute(String key, double value) {
		switch ((int)value) {
		case 1:
			System.out.println("µÕ“Ù");
			break;
		case 2:
			System.out.println("÷–“Ù");
			break;
		case 3:
			System.out.println("∏ﬂ“Ù");
			break;
		default:
			break;
		}
	}

}
