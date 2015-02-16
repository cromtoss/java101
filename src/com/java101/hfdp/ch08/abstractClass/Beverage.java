/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch08/abstractClass/Beverage.java#2 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch08.abstractClass;

/**
 *  Abstract superclass: shared behavior for beverages.
 *
 *  @author Tom Cross
 *  @version $Revision: #2 $ submitted $DateTime: 2014/05/05 13:16:43 $ by $Author: crosta $	
 */
public abstract class Beverage {

	public void boilWater() {
		System.out.println("Boiling water.");
	}


	public void pourInCup() {
		System.out.println("Pouring in a cup.");
	}

}
