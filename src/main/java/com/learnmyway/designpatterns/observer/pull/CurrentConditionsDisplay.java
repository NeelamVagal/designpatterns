package com.learnmyway.designpatterns.observer.pull;

import java.util.Observable;
import java.util.Observer;

//CurrentConditionsDisplay is a concrete object that implements the java.util.Observer interface
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Observable observable;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	public void display() {
		System.out.println("CurrentConditionsDisplay");
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherDataPull) {
			WeatherDataPull weatherDataPull = (WeatherDataPull) obs;
			this.temperature = weatherDataPull.getTemperature();
			this.humidity = weatherDataPull.getHumidity();
			display();
		}
	}

}
