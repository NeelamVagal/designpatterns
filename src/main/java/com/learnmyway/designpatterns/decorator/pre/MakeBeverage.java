package com.learnmyway.designpatterns.decorator.pre;

public class MakeBeverage {

	public static void main(String[] args) {
		DarkRoast darkRoast = new DarkRoast();
		darkRoast.setMilk(true);
		System.out.println("description: "+darkRoast.getDescription());
		System.out.println("cost: "+darkRoast.getCost());
	}

// 1. Price change in condiments will force us to alter existing code
// 2. New condiments will force us to add new methods and alter the cost method in the superclass
// 3. We may have new beverages. For some of these beverages (iced tea?), the condiments may not be  
//    appropriate, yet the Tea subclass will still inherit methods like hasWhip()
// 4. What if a customer wants a double mocha?	
	
}
