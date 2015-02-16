/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/ch09/Mini.java#1 $
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
public final class Mini extends Car {

	private String color;
	private int numDoors;

	public Mini() {
		super("Mini Cooper");
		color = "Black";
		numDoors = 4;
	}

	public Mini(String color) {
		this();
		this.color = color;
	}

	public Mini(int numDoors) {
		this();
		this.numDoors = numDoors;
	}

//	public Mini(String name) {
//		super(name);
//	}

}
