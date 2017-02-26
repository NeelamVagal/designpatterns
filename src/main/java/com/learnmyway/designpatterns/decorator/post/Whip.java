package com.learnmyway.designpatterns.decorator.post;

public class Whip extends CondimentDecorator {

	float abc = 1.1f;
	double xyz = 1.1;
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return .45 + beverage.cost();
	}

}
