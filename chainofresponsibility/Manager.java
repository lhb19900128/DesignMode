package com.liuhongbo.designmode.chainofresponsibility;

public abstract class Manager {
	private Manager manager;
	private String name;

	public Manager(String name, Manager manager) {
		this.name = name;
		this.setManager(manager);
	}

	void setSuperior(Manager manager) {
		this.setManager(manager);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void requestApplication(Request request);

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
}
