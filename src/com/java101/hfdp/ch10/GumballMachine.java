/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch10/GumballMachine.java#2 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch10;

/**
 *  Gumball machine: usage of the State Pattern.
 *
 *  @author Tom Cross
 *  @version $Revision: #2 $ submitted $DateTime: 2014/05/09 15:06:08 $ by $Author: crosta $	
 */
public final class GumballMachine {

	private final State soldOutState = new SoldOutState(this);
	private final State noQuarterState = new NoQuarterState(this);
	private final State hasQuarterState = new HasQuarterState(this);
	private final State soldState = new SoldState(this);

	private State currentState = soldOutState;
	private int count = 0;

	public GumballMachine(int numberGumballs) {
		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			currentState = noQuarterState;
		}
	}

	// Gumball machine user API:
	// Delegate the things the user does to my current state:

	public void insertQuarter() {
		currentState.insertQuarter();
	}

	public void ejectQuarter() {
		currentState.ejectQuarter();
	}

	public void turnCrank() {
		currentState.turnCrank();
		currentState.dispense();
	}


	// This is the API for concrete State objects.
	// State objects will set my state with one of the other states.
	// States can be singletons and I own the pool of singletons.

	void setState(State state) {
		currentState = state;
	}

    State getSoldOutState() {
        return soldOutState;
    }

    State getNoQuarterState() {
        return noQuarterState;
    }

    State getHasQuarterState() {
        return hasQuarterState;
    }

    State getSoldState() {
        return soldState;
    }

	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}

	int getCount() {
		return count;
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + currentState + "\n");
		return result.toString();
	}

}
