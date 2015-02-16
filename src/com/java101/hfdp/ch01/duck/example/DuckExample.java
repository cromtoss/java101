/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch01/duck/example/DuckExample.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch01.duck.example;

import com.java101.hfdp.ch01.duck.FlyNoWay;
import com.java101.hfdp.ch01.duck.Mallard;
import com.java101.hfdp.ch01.duck.Squeak;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public final class DuckExample {

	public static final Mallard MALLARD = new Mallard();


	public static void main(String[] args) {
		MALLARD.performFly();
		MALLARD.performQuack();

		System.out.println("Changing mallard.");
		MALLARD.setFlyBehavior(new FlyNoWay());
		MALLARD.setQuackBehavior(new Squeak());

		System.out.println("Activating mallard.");
		MALLARD.performFly();
		MALLARD.performQuack();
	}
}
