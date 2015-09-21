package com.liuhongbo.designmode.bridge;

public class HandsetBrandN extends HandsetBrand{
	private HandsetSoft handsetSoft;
	
	public HandsetBrandN(HandsetSoft handsetSoft) {
		this.handsetSoft = handsetSoft;
	}
	@Override
	public void run() {
		handsetSoft.run();
	}
	
}
