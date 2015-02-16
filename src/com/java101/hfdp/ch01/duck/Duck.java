/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch01/duck/Duck.java#1 $
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
public abstract class Duck implements FlyBehavior {

	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;


	public abstract void display();


	protected Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}

    @Override
    public void fly() {
        flyBehavior.fly();
    }


    //	// All ducks must fly, but they might do it differently.
//	public void performFly() {
//		flyBehavior.fly();
//	}


	// All ducks must quack, but they might do it differently.
	public void performQuack() {
		quackBehavior.quack();
	}


	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}


	protected void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}


	protected void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
