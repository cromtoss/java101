/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/ch15/ThreadTestDrive.java#1 $
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
public final class ThreadTestDrive {

	private static void makeAThread() {
		Runnable threadJob = new MyRunnable();
		Thread myThread = new Thread(threadJob);

		myThread.start();

		System.out.println("back in main");
	}

	public static void main(String[] args) {
		makeAThread();
		makeAThread();
		makeAThread();
		makeAThread();
		makeAThread();
	}
}
