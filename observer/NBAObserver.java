package com.liuhongbo.designmode.observer;

public class NBAObserver extends Observer {

	String name;
	Subject subject;

	public NBAObserver(String name, Subject subject) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.subject = subject;
	}

	@Override
	public void update(String state) {
		// TODO Auto-generated method stub
		System.out.println(name + ":" + state);
	}

}
