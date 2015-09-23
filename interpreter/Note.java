package com.liuhongbo.designmode.interpreter;

public class Note extends Expression {

	@Override
	public void excute(String key, double value) {
		if (key.equals("C")) {
			System.out.println("1");
		} else if (key.equals("D")) {
			System.out.println("2");
		} else if (key.equals("E")) {
			System.out.println("3");
		} else if (key.equals("F")) {
			System.out.println("4");
		} else if (key.equals("G")) {
			System.out.println("5");
		} else if (key.equals("A")) {
			System.out.println("6");
		} else if (key.equals("B")) {
			System.out.println("7");
		}
	}

}
