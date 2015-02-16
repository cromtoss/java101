/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch08/templateMethod/Beverage.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch08.templateMethod;

/**
 *  Beverage superclass: template method pattern.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/05/02 12:48:16 $ by $Author: crosta $	
 */
public abstract class Beverage {

	public final void prepare() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}


	protected abstract void brew();


	protected abstract void addCondiments();


	protected void pourInCup() {
		System.out.println("Pouring in a cup.");
	}


	private final void boilWater() {
		System.out.println("Boiling water.");
	}

}
