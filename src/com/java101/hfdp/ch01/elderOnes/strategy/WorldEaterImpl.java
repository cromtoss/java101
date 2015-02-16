/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch01/elderOnes/strategy/WorldEaterImpl.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch01.elderOnes.strategy;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public final class WorldEaterImpl implements WorldEater {

	@Override
	public void eatWorld() {
		System.out.println("Yummy planet.");
	}


	@Override
	public void haveANiceDigestif() {
		System.out.println("How about a nice cognac.");
	}

}
