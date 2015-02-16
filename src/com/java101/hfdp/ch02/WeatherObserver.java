/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch02/WeatherObserver.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch02;

/**
 *  Interface for weather observers (Observer Pattern).
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/13 19:55:02 $ by $Author: crosta $	
 */
public interface WeatherObserver {

	void onWeatherChange();
}
