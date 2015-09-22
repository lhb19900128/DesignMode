package com.liuhongbo.designmode.command;

public class BakeChickenWingCommand implements Command {
	private Barbecuer barbecuer;
	
	public BakeChickenWingCommand(Barbecuer barbecuer) {
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
		barbecuer.BakeChickenWing();
	}
}
