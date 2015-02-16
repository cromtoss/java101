/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch02/display/TomConditionsDisplay.java#3 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch02.display;

import com.java101.hfdp.ch02.WeatherData;

/**
 *  A distilled take on the weather from Tom's perspective.
 *
 *  @author Tom Cross
 *  @version $Revision: #3 $ submitted $DateTime: 2014/03/14 16:10:35 $ by $Author: crosta $	
 */
public final class TomConditionsDisplay extends Display {

	private final WeatherData subject;
	private String quality;


	public TomConditionsDisplay(WeatherData subject) {
		super("Tom's Weather-O-Matic");

		this.subject = subject;
		subject.subscribeTemperatureObserver(this);
		onWeatherChange(); //initialize quality value with current subject.
	}


	@Override
	public void onWeatherChange() {
		final int current = subject.getFahrenheitTemperature();

		if (current >= 20 && current <= 85) {
			quality = "good";
		} else {
			quality = "bad";
		}

		display();
	}


	@Override
	public void display() {
		System.out.println(getName() + " judges the weather to be " + quality + ".");
	}


}
