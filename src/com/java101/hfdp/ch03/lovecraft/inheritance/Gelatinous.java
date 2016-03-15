/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch03/elderOnes/strategy/Gelatinous.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch03.lovecraft.inheritance;

import com.java101.hfdp.ch03.lovecraft.OtherworldlySpeaker;

/**
 *  An intentionally wrong example of a decorator that tries to directly
 *  use the base class without re-implementing all of the methods.
 */
public final class Gelatinous implements OtherworldlySpeaker {

	private final OtherworldlySpeaker otherworldlySpeaker;


	public Gelatinous(OtherworldlySpeaker otherworldlySpeaker) {
		this.otherworldlySpeaker = otherworldlySpeaker;
	}


	@Override
	public void speakFromBeyond() {
		otherworldlySpeaker.speakFromBeyond();
		System.out.println("Gelatinous goo jibbers");
	}
}
