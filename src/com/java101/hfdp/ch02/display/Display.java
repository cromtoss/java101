/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch02/display/Display.java#2 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch02.display;

import com.java101.hfdp.ch02.WeatherObserver;

/**
 *  Abstract superclass for displays.
 *
 *  @author Tom Cross
 *  @version $Revision: #2 $ submitted $DateTime: 2014/03/13 19:55:02 $ by $Author: crosta $	
 */
public abstract class Display implements WeatherObserver {

	private final String name;


	protected Display(String name) {
		this.name = name;
	}


	public abstract void display();


	public String getName() {
		return name;
	}

}
