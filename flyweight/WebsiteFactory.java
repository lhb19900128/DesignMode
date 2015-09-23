package com.liuhongbo.designmode.flyweight;

import java.util.HashMap;

public class WebsiteFactory {
	private HashMap<String, Website> map = new HashMap<String, Website>();
	
	public Website getWebsiteCategory(String key){
		if(!map.containsKey(key)){
			map.put(key, new ConcreteWebsite(key));
		}
		return map.get(key);
	}
	
	public int getTotalCategory(){
		return map.size();
	}
}
