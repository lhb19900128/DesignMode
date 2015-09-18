package com.liuhongbo.designmode.state;

public class EveningState implements State {

	int hour = 21;

	@Override
	public void workState(Work work) {
		// TODO Auto-generated method stub
		if (work.isFinished()) {
			work.setState(new RestState());
			work.workState();
		} else {
			if (work.getHour() < hour) {
				System.out.println("¼Ó°àÖÐ...");
			} else {
				work.setState(new SleepingState());
				work.workState();
			}
		}
	}

}
