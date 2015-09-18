package com.liuhongbo.designmode.facade;

public class Fund {
	Stock1 stock1;
	Stock2 stock2;
	Stock3 stock3;
	NationDebt1 nationDebt1;
	Realty1 realty1;

	public Fund() {
		stock1 = new Stock1();
		stock2 = new Stock2();
		stock3 = new Stock3();
		nationDebt1 = new NationDebt1();
		realty1 = new Realty1();
	}

	public void buy() {
		stock1.buy();
		stock2.buy();
		stock3.buy();
		nationDebt1.buy();
		realty1.buy();
	}

	public void sell() {
		stock1.sell();
		stock2.sell();
		stock3.sell();
		nationDebt1.sell();
		realty1.sell();
	}
}
