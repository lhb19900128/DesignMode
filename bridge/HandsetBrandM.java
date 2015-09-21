package com.liuhongbo.designmode.bridge;

public class HandsetBrandM extends HandsetBrand{
	private HandsetSoft handsetSoft;
	
	public HandsetBrandM(HandsetSoft handsetSoft) {
		this.handsetSoft = handsetSoft;
	}
	@Override
	public void run() {
		handsetSoft.run();
	}
	
}
