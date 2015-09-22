package com.liuhongbo.designmode.command;

public class Waiter {
	private Command command;
	
	public Waiter(Command command) {
		this.command = command;
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void notifyBarbecuer(){
		command.excuteCommand();
	}
}
