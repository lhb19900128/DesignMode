package com.liuhongbo.designmode.proxy;

public class ProxyDemo {
	public static void main(String[] args){
		SchoolGirl schoolGirl = new SchoolGirl("½¿½¿");
		Proxy proxy = new Proxy(schoolGirl);
		proxy.GiveChocolate();
	}
}
