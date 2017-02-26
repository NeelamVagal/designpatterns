package com.learnmyway.designpatterns.decorator.pre;

public class DarkRoast extends Beverage {

	public DarkRoast(){
		description = "Dark Roast";
	}
	
	@Override
	public double getCost(){
		return 5.0 + super.getCost();
	}
}
