package com.learnmyway.designpatterns.strategy;

public class DuckSimulator {
	
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.setFlyBehavior(new FlyNoWay());
		mallardDuck.performFly();
		mallardDuck.performQuack();
	}
}
