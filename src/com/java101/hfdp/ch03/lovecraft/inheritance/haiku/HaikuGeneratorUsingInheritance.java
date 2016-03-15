/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch03/elderOnes/example/Example.java#2 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch03.lovecraft.inheritance.haiku;

import com.java101.hfdp.ch03.lovecraft.ElderOne;
import com.java101.hfdp.ch03.lovecraft.ElderOneDefault;
import com.java101.hfdp.ch03.lovecraft.OtherworldlySpeaker;
import com.java101.hfdp.ch03.lovecraft.inheritance.*;
import com.java101.hfdp.ch03.lovecraft.inheritance.Gelatinous;

/**
 *  Haiku generator bootstrap for Chapter 3. This version uses decorators that inherit from a base abstract decorator class.
 */
public final class HaikuGeneratorUsingInheritance {

	private static final ElderOne CTHULHU;
	private static final ElderOne ITHAQUA;

	static {
		CTHULHU = new ElderOneDefault(
			"Cthulhu",
			"The Caller",
			"H. P. Lovecraft",
			"A mix between a giant human, an octopus, and a dragon, and is depicted as being hundreds of meters tall, with human-looking arms and legs and a pair of rudimentary wings on its back.",
            "The Dread Cthulhu"
		);

		ITHAQUA = new ElderOneDefault(
			"Ithaqua",
			"The Caller",
			"Algernon Blackwood",
			"A gigantic, corpse-like human with webbed feet and glowing red eyes.",
            "The vile yeti stomps"
		);

	}

    // LET'S REFACTOR THIS TO INCLUDE THE NAMES OF THE POETS!
	public static void main(String[] args) {
		CTHULHU.speakFromBeyond();

		System.out.println(); // make a line break

		// Let's generate some haiku.
		final OtherworldlySpeaker cthulhuDecorated = new WorldEater(new InsanityCauser(CTHULHU));
		cthulhuDecorated.speakFromBeyond();

		System.out.println(); // make a line break

		final OtherworldlySpeaker hasturDecorated = new Gelatinous(new Gelatinous(ITHAQUA));
		hasturDecorated.speakFromBeyond();
	}

}
