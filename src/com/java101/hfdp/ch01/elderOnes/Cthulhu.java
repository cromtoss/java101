/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch01/elderOnes/Cthulhu.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch01.elderOnes;

import com.java101.hfdp.ch01.elderOnes.strategy.DeepSleeper;
import com.java101.hfdp.ch01.elderOnes.strategy.DeepSleeperAmbien;
import com.java101.hfdp.ch01.elderOnes.strategy.InsanityCauser;
import com.java101.hfdp.ch01.elderOnes.strategy.InsanityCauserImpl;
import com.java101.hfdp.ch01.elderOnes.strategy.WorldEater;
import com.java101.hfdp.ch01.elderOnes.strategy.WorldEaterImpl;

/**
 *  Represents Cthulhu, an asleep, insanity-causing, world-eater.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public final class Cthulhu extends ElderOne implements DeepSleeper, InsanityCauser, WorldEater {

	private DeepSleeper deepSleeper = new DeepSleeperAmbien();
	private InsanityCauser insanityCauser = new InsanityCauserImpl();
	private WorldEater worldEater = new WorldEaterImpl();


	public Cthulhu(String name, String nickname, String author, String description) {
		super(name, nickname, author, description);
	}


	@Override
	public void eatWorld() {
		worldEater.eatWorld();
	}


	@Override
	public void haveANiceDigestif() {
		worldEater.haveANiceDigestif();
	}


	@Override
	public void causeNightmares() {
		insanityCauser.causeNightmares();
	}


	@Override
	public void causeWakingVisions() {
		insanityCauser.causeWakingVisions();
	}


	@Override
	public void causeHearingVoices() {
		insanityCauser.causeHearingVoices();
	}


	@Override
	public void fallAsleep() {
		deepSleeper.fallAsleep();
	}


	@Override
	public boolean isOnSleepMeds() {
		return deepSleeper.isOnSleepMeds();
	}


	@Override
	public void performNightEating() {
		deepSleeper.performNightEating();
	}
}
