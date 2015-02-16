/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch01/elderOnes/strategy/DeepSleeperDefault.java#1 $
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
public final class DeepSleeperDefault implements DeepSleeper {

	@Override
	public void fallAsleep() {
		System.out.println("Zzzzzzz...");
	}


	@Override
	public boolean isOnSleepMeds() {
		return false;
	}


	@Override
	public void performNightEating() {
		System.out.println("Not having a midnight snack");
	}
}
