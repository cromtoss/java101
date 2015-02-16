/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch02/example/Example.java#3 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch02.example;

import com.java101.hfdp.ch02.WeatherData;
import com.java101.hfdp.ch02.display.Display;
import com.java101.hfdp.ch02.display.EricaConditionsDisplay;
import com.java101.hfdp.ch02.display.TomConditionsDisplay;

import java.util.Arrays;
import java.util.List;

/**
 *  Runs the example program for Chapter 2.
 *
 *  @author Tom Cross
 *  @version $Revision: #3 $ submitted $DateTime: 2014/03/14 16:10:35 $ by $Author: crosta $	
 */
public final class Example {

	// Initialize weather data with "current weather."
	private static final WeatherData WEATHER_DATA = new WeatherData(40, 40, "Fair.");

	public static void main(String[] args) {
		final Display tom = new TomConditionsDisplay(WEATHER_DATA);
		final Display erica = new EricaConditionsDisplay(WEATHER_DATA);

		System.out.println("***** TEMPERATURE DATA UPDATING! *****");
		WEATHER_DATA.updateTemperature(86);

		System.out.println("***** DEWPOINT DATA UPDATING! *****");
		WEATHER_DATA.updateDewpoint(55);
	}
}
