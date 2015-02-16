/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch10/SoldState.java#2 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch10;

/**
 *  Concrete state object.
 *
 *  @author Tom Cross
 *  @version $Revision: #2 $ submitted $DateTime: 2014/05/09 15:06:08 $ by $Author: crosta $	
 */
final class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}

	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}

	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

	public String toString() {
		return "dispensing a gumball";
	}
}
