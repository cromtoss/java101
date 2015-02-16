/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch02/display/EricaConditionsDisplay.java#3 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch02.display;

import com.java101.hfdp.ch02.WeatherData;

/**
 *  A weather interpretation from Erica's perspective.
 *
 *  @author Tom Cross
 *  @version $Revision: #3 $ submitted $DateTime: 2014/03/14 16:10:35 $ by $Author: crosta $	
 */
public final class EricaConditionsDisplay extends Display {

	private final WeatherData weatherData;
	private String quality;


	public EricaConditionsDisplay(WeatherData subject) {
		super("Erica's Weather Watcher");

		this.weatherData = subject;
		subject.subscribeDewpointObserver(this);
		onWeatherChange(); //initialize quality value with current subject.
	}


	@Override
	public void onWeatherChange() {
		final int dew = weatherData.getDewPoint();

		if (dew <= 50) {
			quality = "perfect";
		} else if (dew > 50 && dew <= 70) {
			quality = "livable";
		} else {
			quality = "miserable";
		}

		display();
	}


	@Override
	public void display() {
		System.out.println(getName() + " thinks the weather is " + quality + ".");
	}

}
