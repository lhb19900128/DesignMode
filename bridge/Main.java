package com.liuhongbo.designmode.bridge;

public class Main {
	public static void main(String[] args){
		HandsetSoft handsetSoft = new HandsetGame();
		HandsetBrand handsetBrand = new HandsetBrandM(handsetSoft);
		handsetBrand.run();
	}
}
