package com.liuhongbo.designmode.state;

public class Work {
	private State state;
	private boolean isFinished;
	private int hour;

	public Work() {
		isFinished = false;
		hour = 9;
		state = new ForenoonState();
	}

	public Work(State state, int hour) {
		isFinished = false;
		this.state = state;
		this.hour = hour;
	}

	public Work(State state, int hour, boolean isFinished) {
		this.isFinished = isFinished;
		this.state = state;
		this.hour = hour;
	}

	public void workState() {
		state.workState(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public boolean isFinished() {
		return isFinished;
	}

	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
}
