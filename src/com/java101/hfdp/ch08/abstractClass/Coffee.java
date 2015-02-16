/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch08/abstractClass/Coffee.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch08.abstractClass;

/**
 *  Coffee beverage: implemented using old-school inheritance.
 *  Don't do this.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/05/02 12:48:16 $ by $Author: crosta $	
 */
public class Coffee extends Beverage {

	public void prepareRecipe() {
		boilWater();
		brewGrounds();
		pourInCup();
		addSugarAndMilk();
	}


	public void brewGrounds() {
		System.out.println("Brewing grounds!");
	}


	public void addSugarAndMilk() {
		System.out.println("You must be a girl because you take your coffee like one.");
	}
}
