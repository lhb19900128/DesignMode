package com.liuhongbo.designmode.command;

public class BakeMuttonCommand implements Command {
	private Barbecuer barbecuer;
	
	public BakeMuttonCommand(Barbecuer barbecuer) {
		this.barbecuer = barbecuer;
	}

	public Barbecuer getBarbecuer() {
		return barbecuer;
	}

	public void setBarbecuer(Barbecuer barbecuer) {
		this.barbecuer = barbecuer;
	}

	@Override
	public void excuteCommand() {
		barbecuer.BakeMutton();
	}
}
