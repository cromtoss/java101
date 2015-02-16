/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/ch12/ConcreteObserver.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.ch12;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public class ConcreteObserver implements Observer {

	public ConcreteObserver(Observable observable) {
		observable.addObserver(this);
	}

	@Override
	public void onSomethingHappened(String desc) {
		System.out.println("I respond to your something in theory!");
	}
}
