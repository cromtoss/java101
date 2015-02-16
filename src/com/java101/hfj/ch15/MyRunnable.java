/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/ch15/MyRunnable.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.ch15;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public final class MyRunnable implements Runnable {

	@Override
	public void run() {
		go();
	}

	private void go() {
		doMore();
	}

	private void doMore() {
		System.out.println("top o' the stack");
	}

}
