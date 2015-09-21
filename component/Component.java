package com.liuhongbo.designmode.component;

public abstract class Component {
	private String name;

	public Component(String name) {
		// TODO Auto-generated constructor stub
		this.setName(name);
	}

	public abstract void add(Component c);

	public abstract void delete(Component c);

	public abstract void dispaly(int depth);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
