package com.learnmyway.designpatterns.observer.push;

//CurrentConditionsDisplay is a concrete object that implements the Observer interface
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData; // why store a reference when not using
										// anywhere else? We need to because in
										// future we may want to unregister
										// ourselves as an observer
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display(); // is it a good place to call display() here in update? Let's see this in
					// model-view-controller pattern
	}

	public void display() {
		System.out.println("CurrentConditionsDisplay");
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

}
