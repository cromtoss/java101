/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/ch09/Car.java#1 $
 *
 *	Copyright � 2013 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.ch09;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public abstract class Car {

	private String model;

	public Car(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

}
