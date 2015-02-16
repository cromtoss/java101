/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/songs/TestBox.java#1 $
 *
 *	Copyright � 2013 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.songs;

/**
 *  Code example from page 291.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public final class TestBox {

	// 1) What pieces of this class are in a static context? What pieces of this class are non-static?

	// 2) What are these initialized to?
	private Integer i;  //= null
	private int j;      //= 0

	public void go() {
		j = i;                 		// 3) What is the implication of this assignment?
		System.out.println(j);
		System.out.println(i);
	}

	public static void main(String[] args) {
		TestBox testBox = new TestBox();
		testBox.go();  				// 4) What happens?
	}

}
