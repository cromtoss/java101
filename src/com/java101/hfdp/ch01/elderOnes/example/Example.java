/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch01/elderOnes/example/Example.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch01.elderOnes.example;

import com.java101.hfdp.ch01.elderOnes.ElderOne;
import com.java101.hfdp.ch01.elderOnes.Cthulhu;
import com.java101.hfdp.ch01.elderOnes.Hastur;
import com.java101.hfdp.ch01.elderOnes.Ithaqua;
import com.java101.hfdp.ch01.elderOnes.Tsathoggua;
import com.java101.hfdp.ch01.elderOnes.Yig;
import com.java101.hfdp.ch01.elderOnes.strategy.DeepSleeper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
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

		final List<ElderOne> elders = Arrays.asList(CTHULHU, HASTUR, ITHAQUA, TSATHOGGUA, YIG);

		for (ElderOne elder : elders) {
			System.out.println("I'm " + elder.getName() + ", but call me " + elder.getNickname() + ".");
		}

		// tcTODO example implementation of WorldEaterImpl
		// tcTODO implement the appropriate behaviors on the elder ones

		// tcTODO Get the sleepers and see how they sleep.
		List<DeepSleeper> sleepers = new ArrayList<>();
		for (ElderOne elder : elders) {
			if (elder instanceof DeepSleeper) {
				sleepers.add((DeepSleeper) elder);
			}
		}

		for (DeepSleeper sleeper : sleepers) {
			ElderOne elder = (ElderOne) sleeper;
			System.out.println("Meds test for: " + elder.getName());
			System.out.println("Is on meds?: " + sleeper.isOnSleepMeds());
		}

	}


}
