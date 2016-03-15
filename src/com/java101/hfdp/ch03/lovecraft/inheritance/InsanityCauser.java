/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch03/elderOnes/strategy/InsanityCauser.java#2 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch03.lovecraft.inheritance;


import com.java101.hfdp.ch03.lovecraft.ElderOne;

/**
 *  Typical concrete decorator. Allows an ElderOne to cause mere mortals to become insane.
 */
public final class InsanityCauser extends OtherworldlySpeakerDecorator {

	public InsanityCauser(ElderOne elderOne) {
		super(elderOne);
	}


	@Override
	public void speakFromBeyond() {
		getDelegate().speakFromBeyond();
		System.out.println("A crazed voice heard from elsewhere.");
	}

}
