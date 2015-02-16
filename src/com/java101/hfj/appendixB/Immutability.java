/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/appendixB/Immutability.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.appendixB;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public final class Immutability {

	public static void main(String[] args) {
		Integer x = 77; //new Integer(77);
		Integer y = 77; //new Integer(77);

		if (x == y) {
			System.out.println("== was true");
		}

		if (x.equals(y)) {
			System.out.println(".equals() was true");
		}

		System.out.println("Now you know and knowledge is half the battle.");

	}

}
