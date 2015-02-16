/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/snowboard/Snowboard.java#1 $
 *
 *	Copyright � 2013 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.snowboard;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public class Snowboard {

	public void shred() { /* Pretend there is something here */ }

	public void getAir() { /* Pretend there is something here */ }

	public void turn() { /* Pretend there is something here */ }

	public void loseControl() { /* Pretend there is something here */ }


	@Override
	public String toString() {
		return "I am a gnarly snowboard!";
	}


	public static void main(String[] args) {

		Object object = new Snowboard();

		// What will this return? The generic Object toString() output,
		// or "I am a gnarly snowboard!"
		System.out.println(object.toString());
	}
}
