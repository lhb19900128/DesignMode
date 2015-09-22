package com.liuhongbo.designmode.command;

public class Main {
	public static void main(String[] args) {
		Barbecuer barbecuer = new Barbecuer();
		Command command = new BakeChickenWingCommand(barbecuer);
		Waiter waiter = new Waiter(command);
		waiter.notifyBarbecuer();
		waiter.setCommand(new BakeMuttonCommand(barbecuer));
		waiter.notifyBarbecuer();
	}
}
