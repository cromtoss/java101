/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/inheritance/Jackal.java#1 $
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
public class Jackal extends Canine {

	private static String noise = "raawrrrawrrrghrr!";


	public static void main(String[] args) {
		Jackal jackal = new Jackal();
		jackal.setNoise(noise);
		System.out.println("The jackal's noise is: " + jackal.getNoise());
	}

}
