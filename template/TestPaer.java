package com.liuhongbo.designmode.template;

public abstract class TestPaer {
	public void testQuestion1() {
		System.out.println("question1 " + answer1());
	}

	public void testQuestion2() {
		System.out.println("question2 " + answer2());
	}

	public void testQuestion3() {
		System.out.println("question3 " + answer3());
	}

	abstract public String answer1();

	abstract public String answer2();

	abstract public String answer3();
}
