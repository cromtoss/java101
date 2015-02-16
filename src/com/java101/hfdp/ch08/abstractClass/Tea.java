/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch08/abstractClass/Tea.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch08.abstractClass;

/**
 *  Tea beverage: implemented using old-school inheritance.
 *  Don't do this.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/05/02 12:48:16 $ by $Author: crosta $	
 */
public final class Tea extends Beverage {

	public void makeTea() {
		boilWater();
		steep();
		pourInCup();
		addLemon();
	}

	public void steep() {
		System.out.println("Steeping the tea.");
	}


	public void addLemon() {
		System.out.println("How civilized, a lemon.");
	}
}
