/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/songs/Singleton.java#1 $
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
public final class Singleton {

	private static final Singleton THE_ONE = new Singleton();

	private static int myNumber = 7;

	private Singleton() {}

	public static Singleton getSingleton() {
		return THE_ONE;
	}

	public static int getMyNumber() {
		return 7;
	}

}
