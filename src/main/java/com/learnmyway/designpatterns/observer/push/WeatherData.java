package com.learnmyway.designpatterns.observer.push;

import java.util.ArrayList;

//WeatherData is a concrete subject that implements the Subject interface
public class WeatherData implements Subject{

	private float temperature;
	private float humidity;
	private float pressure;

	private ArrayList<Observer> observers;
	
	//private CurrentConditionsDisplay currentConditionsDisplay;
	
	public WeatherData() {
		//currentConditionsDisplay = new CurrentConditionsDisplay();
		observers = new ArrayList<Observer>();
	}
	
/*	public float getTemperature(){
		return temperature;
	}
	
	public float getHumidity(){
		return humidity;
	}
	
	public float getPressure(){
		return pressure;
	}*/
	
	public void measurementsChanged(){
//		float temp = getTemperature();
//		float humidity = getHumidity();
//		float pressure = getPressure();
		//currentConditionsDisplay.update(temp, humidity, pressure);
		notifyObservers();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}
	}

	public void notifyObservers() {
		for(Observer o: observers){
			o.update(temperature, humidity, pressure);
		}
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
