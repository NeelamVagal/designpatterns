package com.learnmyway.designpatterns.observer.push;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 65.7f, 30.4f);
	}
}
