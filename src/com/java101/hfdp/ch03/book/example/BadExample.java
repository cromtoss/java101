/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch03/book/example/BadExample.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch03.book.example;

import com.java101.hfdp.ch03.book.Beverage;
import com.java101.hfdp.ch03.book.Espresso;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/25 12:02:17 $ by $Author: crosta $	
 */
public final class BadExample {

	public static void main(String[] args) {
		// Let's make something sweet and tasty...
		Beverage myBeverage = new Espresso();
		myBeverage.setWhip(true);
		myBeverage.setMocha(true);

		System.out.println("My mocha costs: " + myBeverage.costInCents() + " cents.");
	}
}
