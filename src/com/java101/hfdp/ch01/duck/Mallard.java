/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch01/duck/Mallard.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch01.duck;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public final class Mallard extends Duck implements FlyBehavior {

	public Mallard() {
		super(new FlyWithWings(), new Quack());
	}


	@Override
	public void display() {
		System.out.println("A mallard appears!");
	}


	// Allow other objects to change our behaviors:

	@Override
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		super.setFlyBehavior(flyBehavior);
	}


	@Override
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		super.setQuackBehavior(quackBehavior);
	}
}
