/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch01/elderOnes/strategy/DeepSleeperAmbien.java#1 $
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
public final class DeepSleeperAmbien implements DeepSleeper {

	@Override
	public void performNightEating() {
		System.out.println("CHOMP CHOMP CHOMP all the brownies are gone now. Zzzz...");
	}


	@Override
	public boolean isOnSleepMeds() {
		return true; //it's Ambien!
	}


	@Override
	public void fallAsleep() {
		System.out.println("Snore snort blort zzzzzzz...");
	}
}
