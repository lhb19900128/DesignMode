package com.liuhongbo.designmode.state;

public class Main {
	public static void main(String[] args){
		Work work = new Work();
		work.workState();
		
		work.setHour(21);
		work.workState();
		
	}
}
