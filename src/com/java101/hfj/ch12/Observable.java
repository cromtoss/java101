/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/ch12/Observable.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.ch12;

import java.util.ArrayList;
import java.util.List;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public class Observable {

	private List<Observer> observers = new ArrayList<>();

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void wowItHappened() {
		for (Observer observer : observers) {
			observer.onSomethingHappened("The wowItHappened happened.");
		}
	}

}
