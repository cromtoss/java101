/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/inheritance/Dog.java#1 $
 *
 *	Copyright � 2013 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.inheritance;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public class Dog extends Canine {

	private String noise = "woof!";


	@Override
	public String eat() {
		return "chomp clomp chaw chomp";
	}


	public void goForAWalk() {
		System.out.println("My what a fine day for a little walk.");
	}

}
