package com.liuhongbo.designmode.single;

public final class Singleton2 {
	public static Singleton2 instance = new Singleton2();
	
	private Singleton2(){
		
	}
	
	public Singleton2 getInstance(){
		return instance;
	}
}
