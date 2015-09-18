package com.liuhongbo.designmode.state;

public class ForenoonState implements State{

	int hour = 12;
	@Override
	public void workState(Work work) {
		// TODO Auto-generated method stub
		if(work.getHour() < hour)
			System.out.println("����ܺ�");
		else{
			work.setState(new NoonState());
			work.workState();
		}
	}
	
}
