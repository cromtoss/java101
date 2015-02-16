/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/ch12/Main.java#1 $
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
public final class Main {

	public static void main(String[] args) {
		Observable observable = new Observable();
		Observer observer = new ConcreteObserver(observable);
		Observer another = new ConcreteObserver(observable);
		Observer meToo = new ConcreteObserver(observable);

		observable.wowItHappened();
	}
}
