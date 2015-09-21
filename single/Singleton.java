package com.liuhongbo.designmode.single;

public class Singleton {
	private static Singleton singleton;
	private static final Object OBJECT = new Object();

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized (OBJECT) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
