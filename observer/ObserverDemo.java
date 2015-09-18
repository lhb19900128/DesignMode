package com.liuhongbo.designmode.observer;

public class ObserverDemo {
	public static void main(String[] args){
		Boss huhansan = new Boss();
		Observer observer1 = new NBAObserver("xiaofang", huhansan);
		Observer observer2 = new NBAObserver("xiaoping", huhansan);
		huhansan.add(observer1);
		huhansan.add(observer2);
		
		huhansan.setState("I come back!");
		huhansan.notifyObserver();
		
		huhansan.remove(observer1);
		huhansan.notifyObserver();
	}
}
