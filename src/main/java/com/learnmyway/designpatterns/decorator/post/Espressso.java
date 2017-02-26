package com.learnmyway.designpatterns.decorator.post;

public class Espressso extends Beverage {

	public Espressso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
