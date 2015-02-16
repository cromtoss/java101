/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/fruitbasket/BasketTracker.java#1 $
 *
 *	Copyright � 2012 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.fruitbasket;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/**
 *	//tcTODO
 *
 *	@author Tom "Sweet Sassy Molassy" Cross
 *	@version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */

public final class BasketTracker {

	private Map<Integer, BasketLabel> remembered = new HashMap<Integer, BasketLabel>(3);
	private EnumMap<BasketLabel, String> formats = new EnumMap<BasketLabel, String>(BasketLabel.class);

	public BasketTracker() {
		formats.put(BasketLabel.APPLES, "Apples");
		formats.put(BasketLabel.BOTH, "Both");
	}


	public void remember(int ordinal, BasketLabel contents) {
		remembered.put(ordinal, contents);
	}

	public String toString() {
		final StringBuffer output = new StringBuffer();

		for(Integer ordinal : remembered.keySet()) {
			final BasketLabel currentLabel = remembered.get(ordinal);
			output.append(ordinal.toString() + ": " + formats.get(currentLabel));

			if (ordinal != 3) output.append(", ");
		}

		return output.toString();
	}

}
