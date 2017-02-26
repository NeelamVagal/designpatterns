package com.learnmyway.designpatterns.decorator.post;

public abstract class Beverage {

	String description = "Unknown Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
