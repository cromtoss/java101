/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch04/staticMethod/ElderOneStaticFactory.java#3 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch04.staticMethod;

import com.java101.hfdp.ch04.elders.Cthulhu;
import com.java101.hfdp.ch04.elders.ElderOne;
import com.java101.hfdp.ch04.elders.characteristic.Elders;
import com.java101.hfdp.ch04.elders.Hastur;
import com.java101.hfdp.ch04.elders.Ithaqua;
import com.java101.hfdp.ch04.elders.Tsathoggua;
import com.java101.hfdp.ch04.elders.Yig;

import java.util.Arrays;
import java.util.List;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #3 $ submitted $DateTime: 2014/03/27 10:22:39 $ by $Author: crosta $	
 */
public final class ElderOneStaticFactory {

	private static final List<ElderOne> ALL_ELDERS;

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

		ALL_ELDERS = Arrays.asList(CTHULHU, HASTUR, ITHAQUA, TSATHOGGUA, YIG);
	}


	private ElderOneStaticFactory() {
		throw new AssertionError("Not to be instantiated");
	}


	/**
	 * Typical static factory method.
	 *
	 * Note: this method actually returns a singleton instead of a new object.
	 *
	 * @param elderType
	 * 	the elder desired.
	 *
	 * @return
	 * 	a concrete elder of the desired type.
	 */
	public static ElderOne create(Elders elderType) {
		for (ElderOne elderOne : ALL_ELDERS) {
			if (elderOne.getElderType() == elderType) {
				return elderOne;
			}
		}

		throw new IllegalArgumentException("No elder one for provided type " + elderType + "!");
	}

}
