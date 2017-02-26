package com.learnmyway.designpatterns.decorator.pre;

public class Beverage {

	protected String description;
	private boolean milk;
	private boolean soy;
	private double milkCost = 1.0;
	private double soyCost = 2.0;

	public double getCost(){
		double condimentCost = 0.0;
		if(isMilk()){
			condimentCost += milkCost;
		}
		if(isSoy()){
			condimentCost +=soyCost;
		}
		return condimentCost;
	}
	
	public String getDescription(){
		return description;
	}

	public boolean isMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public boolean isSoy() {
		return soy;
	}

	public void setSoy(boolean soy) {
		this.soy = soy;
	}
	
}
