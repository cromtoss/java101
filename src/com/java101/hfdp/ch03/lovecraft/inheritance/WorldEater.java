/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch03/elderOnes/strategy/WorldEater.java#2 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch03.lovecraft.inheritance;

import com.java101.hfdp.ch03.lovecraft.ElderOne;

/**
 *  Typical concrete decorator using inheritance from an abstract base decorator.
 */
public final class WorldEater extends OtherworldlySpeakerDecorator {

	public WorldEater(ElderOne elderOne) {
		super(elderOne);
	}


	@Override
	public void speakFromBeyond() {
		getDelegate().speakFromBeyond();
		System.out.println("The world is so tasty");
	}
}
