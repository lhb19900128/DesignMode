package com.liuhongbo.designmode.flyweight;

public class Main {
	public static void main(String[] args){
		WebsiteFactory factory = new WebsiteFactory();
		Website website = factory.getWebsiteCategory("product show");
		factory.getWebsiteCategory("product show");
		factory.getWebsiteCategory("product show");
		factory.getWebsiteCategory("blog");
		factory.getWebsiteCategory("blog");
		factory.getWebsiteCategory("blog");
		website.use(new User("xiaoping", "hello"));
		System.out.println(factory.getTotalCategory());
	}
}
