package com.liuhongbo.designmode.adapter;

public abstract class Player {
	private String name;

	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public Player(String name) {
		this.name = name;
	}

	public abstract void attack();

	public abstract void defense();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
