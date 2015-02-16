/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/songs/Basket.java#1 $
 *
 *	Copyright � 2013 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.songs;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public final class Basket {

	private static int count;

	private String name;

	public Basket(String name) {
		this.name = name;
		count++;
	}

	public static int getCount() {
		return count;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Basket one = new Basket("Tom");
		Basket two = new Basket("Neelima");
		Basket three = new Basket("Jim");
		Basket theWorst = new Basket("Jon");

		System.out.println("The basket count is: " + count);
	}

}
