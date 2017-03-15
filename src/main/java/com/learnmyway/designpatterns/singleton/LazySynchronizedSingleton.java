package com.learnmyway.designpatterns.singleton;

public class LazySynchronizedSingleton {

	private volatile static LazySynchronizedSingleton uniqueInstance;
	
	private LazySynchronizedSingleton(){}
	
	public static LazySynchronizedSingleton getInstance(){
		if(uniqueInstance == null){
			synchronized (LazySynchronizedSingleton.class) {
				if(uniqueInstance == null){
					uniqueInstance = new LazySynchronizedSingleton();
				}
			}
		}
		return uniqueInstance;
	}
}
