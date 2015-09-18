package com.liuhongbo.designmode.observer;

import java.util.LinkedList;
import java.util.List;

public class Boss implements Subject {
	private List<Observer> list = new LinkedList<Observer>();
	private String state;

	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		list.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		// TODO Auto-generated method stub
		list.remove(observer);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (Observer observer : list) {
			observer.update(state);
		}
	}

	public List<Observer> getList() {
		return list;
	}

	public void setList(List<Observer> list) {
		this.list = list;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
