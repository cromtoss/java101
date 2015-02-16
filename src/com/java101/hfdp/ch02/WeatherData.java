/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch02/WeatherData.java#3 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch02;

import java.util.HashSet;
import java.util.Set;

/**
 *  Observable subject. Note no interface is actually required for the subject in
 *  the Observer pattern.
 *
 *  @author Tom Cross
 *  @version $Revision: #3 $ submitted $DateTime: 2014/03/14 16:10:35 $ by $Author: crosta $	
 */
public final class WeatherData {

	private int fahrenheitTemperature;
	private int dewPoint;
	private String description;

	private Set<WeatherObserver> temperatureObservers = new HashSet<>();
	private Set<WeatherObserver> dewpointObservers = new HashSet<>();



	public WeatherData(int fahrenheitTemperature, int dewPoint, String description) {
		this.fahrenheitTemperature = fahrenheitTemperature;
		this.dewPoint = dewPoint;
		this.description = description;
	}


	public int getFahrenheitTemperature() {
		return fahrenheitTemperature;
	}


	public int getDewPoint() {
		return dewPoint;
	}


	public String getDescription() {
		return description;
	}


	public void updateDewpoint(int dewPoint) {
		this.dewPoint = dewPoint;

		for (WeatherObserver observer : dewpointObservers) {
			observer.onWeatherChange();
		}
	}


	public void updateTemperature(int temperature) {
		this.fahrenheitTemperature = temperature;

		for (WeatherObserver observer : temperatureObservers) {
			observer.onWeatherChange();
		}
	}



	public void subscribeTemperatureObserver(WeatherObserver observer) {
		temperatureObservers.add(observer);
	}


	public void unsubscribeTemperatureObserver(WeatherObserver observer) {
		temperatureObservers.remove(observer);
	}



	public void subscribeDewpointObserver(WeatherObserver observer) {
		dewpointObservers.add(observer);
	}


	public void unsubscribeDewpointObserver(WeatherObserver observer) {
		dewpointObservers.remove(observer);
	}
}
