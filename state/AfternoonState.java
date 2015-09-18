package com.liuhongbo.designmode.state;

public class AfternoonState implements State{

	int hour = 17;

	@Override
	public void workState(Work work) {
		// TODO Auto-generated method stub
		if (work.getHour() < hour)
			System.out.println("ÎçË¯,·¸À§£¡");
		else {
			work.setState(new EveningState());
			work.workState();
		}
	}

}
