/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch04/simpleFactory/ElderOneFactory.java#2 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch04.simpleFactory;

import com.java101.hfdp.ch04.elders.Cthulhu;
import com.java101.hfdp.ch04.elders.ElderOne;
import com.java101.hfdp.ch04.elders.characteristic.Elders;
import com.java101.hfdp.ch04.elders.Hastur;
import com.java101.hfdp.ch04.elders.Ithaqua;
import com.java101.hfdp.ch04.elders.Tsathoggua;
import com.java101.hfdp.ch04.elders.Yig;

/**
 *  Typical factory.
 *
 *  @author Tom Cross
 *  @version $Revision: #2 $ submitted $DateTime: 2014/03/27 10:22:39 $ by $Author: crosta $	
 */
public final class ElderOneFactory {

	/**
	 * Typical simple factory implementation.
	 *
	 * @param elder
	 * 	elder to return
	 *
	 * @return
	 * 	a new concrete {@link ElderOne} of the requested type.
	 */
	public ElderOne create(Elders elder) {
		if (elder == Elders.CTHULHU) {
			return new Cthulhu(
				"Cthulhu",
				"The Caller",
				"H. P. Lovecraft",
				"A mix between a giant human, an octopus, and a dragon, and is depicted as being hundreds of meters tall, with human-looking arms and legs and a pair of rudimentary wings on its back."
			);
		} else if (elder == Elders.HASTUR) {
			return new Hastur(
				"Hastur",
				"The King in Yellow",
				"Ambrose Bierce",
				"Its true form is unknown, but usually manifests either as a polypous, ravenous floating mass endowed with tentacles, drills and suckers or, more frequently, as the King in Yellow, a humanoid being wearing tattered, yellow clothes and a mask hiding the face. It is said to be Cthulhu's (half-)brother."
			);
		} else if (elder == Elders.ITHAQUA) {
			return new Ithaqua(
				"Ithaqua",
				"The Caller",
				"Algernon Blackwood",
				"A gigantic, corpse-like human with webbed feet and glowing red eyes."
			);
		} else if (elder == Elders.TSATHOGGUA) {
			return new Tsathoggua(
				"Tsathoggua",
				"The Sleeper of N'kai",
				"Clark Ashton Smith",
				"Appears as a huge, furry, almost humanoid toad, or a bat-like sloth."
			);
		} else if (elder == Elders.YIG) {
			return new Yig(
				"Yig",
				"Father of Serpents",
				"Zealia Bishop",
				"A giant snake with human arms covered in scales. Son of the Mappo's Dragon, children of his are Ayi'ig and Voltiyig, whereas Rokon is regarded as the brother of Yig."
			);
		}

		throw new IllegalArgumentException("Elder type " + elder + " not supported!");
	}
}
