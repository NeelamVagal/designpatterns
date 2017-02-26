package com.learnmyway.designpatterns.decorator.post;

public class DarkRoast extends Beverage {

	public DarkRoast(){
		description = "Dark Roast";
	}

	@Override
	public double cost() {
		return 5.0;
	}
}
