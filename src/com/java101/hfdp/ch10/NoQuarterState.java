/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch10/NoQuarterState.java#2 $
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
final class NoQuarterState implements State {

    private final GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}

	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	}

	public void dispense() {
		System.out.println("You need to pay first");
	}

	public String toString() {
		return "waiting for quarter";
	}
}
