/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch08/templateMethod/Tea.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch08.templateMethod;

/**
 *  Tea: concrete beverage following template method.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/05/02 12:48:16 $ by $Author: crosta $	
 */
public final class Tea extends Beverage {

	@Override
	protected void brew() {
		System.out.println("Steeping the tea.");
	}


	@Override
	protected void addCondiments() {
		System.out.println("How civilized, a lemon.");
	}


	@Override
	protected void pourInCup() {
		super.pourInCup();
		System.out.println("Extra civilized: a dainty teacup.");
	}
}
