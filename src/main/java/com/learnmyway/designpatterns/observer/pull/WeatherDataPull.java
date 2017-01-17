package com.learnmyway.designpatterns.observer.pull;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


//WeatherDataPull is a Subject
public class WeatherDataPull extends Observable{

	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherDataPull() {}
	
	public float getTemperature(){
		return temperature;
	}
	
	public float getHumidity(){
		return humidity;
	}
	
	public float getPressure(){
		return pressure;
	}
	
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}

/*Behind the scenes

setChanged(){
	changed = true;
}

notifyObervers(Object arg){
	if(changed){
		for every observer on the list{
			call update(this, arg)
		}
		changed = false;
	}
}

notifyObservers(){
	notifyObservers(null);
}
*/
