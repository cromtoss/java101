/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch08/templateMethod/Coffee.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch08.templateMethod;

/**
 *  Coffee: concrete beverage following template method.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/05/02 12:48:16 $ by $Author: crosta $	
 */
public class Coffee extends Beverage {

	@Override
	protected void brew() {
		System.out.println("Brewing grounds!");
	}


	@Override
	protected void addCondiments() {
		System.out.println("You must be a girl because you take your coffee like one.");
	}
}
