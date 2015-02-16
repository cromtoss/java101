/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch03/elderOnes/example/Example.java#2 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch03.elderOnes.example;

import com.java101.hfdp.ch03.elderOnes.Cthulhu;
import com.java101.hfdp.ch03.elderOnes.ElderOne;
import com.java101.hfdp.ch03.elderOnes.Hastur;
import com.java101.hfdp.ch03.elderOnes.Ithaqua;
import com.java101.hfdp.ch03.elderOnes.Tsathoggua;
import com.java101.hfdp.ch03.elderOnes.Yig;
import com.java101.hfdp.ch03.elderOnes.strategy.EclipseTriggerer;
import com.java101.hfdp.ch03.elderOnes.strategy.Gelatinous;
import com.java101.hfdp.ch03.elderOnes.strategy.InsanityCauser;
import com.java101.hfdp.ch03.elderOnes.strategy.WorldEater;

import java.util.Arrays;
import java.util.List;

/**
 *  Example bootstrap for Chapter 3.
 *
 *  @author Tom Cross
 *  @version $Revision: #2 $ submitted $DateTime: 2014/03/14 16:10:35 $ by $Author: crosta $	
 */
public final class Example {

	private static final Cthulhu CTHULHU;
	private static final Hastur HASTUR;
	private static final Ithaqua ITHAQUA;
	private static final Tsathoggua TSATHOGGUA;
	private static final Yig YIG;

	static {
		CTHULHU = new Cthulhu(
			"Cthulhu",
			"The Caller",
			"H. P. Lovecraft",
			"A mix between a giant human, an octopus, and a dragon, and is depicted as being hundreds of meters tall, with human-looking arms and legs and a pair of rudimentary wings on its back."
		);

		HASTUR = new Hastur(
			"Hastur",
			"The King in Yellow",
			"Ambrose Bierce",
			"Its true form is unknown, but usually manifests either as a polypous, ravenous floating mass endowed with tentacles, drills and suckers or, more frequently, as the King in Yellow, a humanoid being wearing tattered, yellow clothes and a mask hiding the face. It is said to be Cthulhu's (half-)brother."
		);

		ITHAQUA = new Ithaqua(
			"Ithaqua",
			"The Caller",
			"Algernon Blackwood",
			"A gigantic, corpse-like human with webbed feet and glowing red eyes."
		);

		TSATHOGGUA = new Tsathoggua(
			"Tsathoggua",
			"The Sleeper of N'kai",
			"Clark Ashton Smith",
			"Appears as a huge, furry, almost humanoid toad, or a bat-like sloth."
		);

		YIG = new Yig(
			"Yig",
			"Father of Serpents",
			"Zealia Bishop",
			"A giant snake with human arms covered in scales. Son of the Mappo's Dragon, children of his are Ayi'ig and Voltiyig, whereas Rokon is regarded as the brother of Yig."
		);
	}


	public static void main(String[] args) {

		CTHULHU.wreakHavoc();

		System.out.println(); // make a line break

		// HAIKU HAVOC!
		// Let's generate some haiku.
		final ElderOne decorated = new WorldEater(new InsanityCauser(CTHULHU));
		System.out.println("A haiku by: " + decorated.getName());
		decorated.wreakHavoc();

		System.out.println(); // make a line break

		final ElderOne another = new EclipseTriggerer(new Gelatinous(HASTUR));
		System.out.println("A poem by: " + another.getName());
		another.wreakHavoc();

	}


}
