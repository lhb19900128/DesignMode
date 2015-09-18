package com.liuhongbo.designmode.state;

public class NoonState implements State {

	int hour = 13;

	@Override
	public void workState(Work work) {
		// TODO Auto-generated method stub
		if (work.getHour() < hour)
			System.out.println("ÎçË¯,·¸À§£¡");
		else {
			work.setState(new AfternoonState());
			work.workState();
		}
	}

}
