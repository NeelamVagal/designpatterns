package com.learnmyway.designpatterns.observer.pull;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherDataPull weatherData = new WeatherDataPull();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 65.7f, 30.4f);
	}
}
