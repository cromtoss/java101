/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch04/factoryMethod/investigator/Investigator.java#3 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch04.factoryMethod.investigator;

import com.java101.hfdp.ch04.elders.ElderOne;
import com.java101.hfdp.ch04.elders.characteristic.Elders;

/**
 *  Abstract base class for operations on a type of elder one.
 *  This class uses the Factory Method pattern.
 *
 *  @author Tom Cross
 *  @version $Revision: #3 $ submitted $DateTime: 2014/03/27 10:22:39 $ by $Author: crosta $	
 */
public abstract class Investigator {

	/**
	 * Typical actions for an {@link ElderOne}.
	 *
	 * In this example, these instructions are unchangeable.
	 *
	 * @param elder
	 * 	elder to operate on.
	 *
	 * @return
	 * 	a concrete {@link ElderOne} of the appropriate type, transformed as appropriate.
	 */
	public final ElderOne investigate(Elders elder) {
		final ElderOne elderOne = createElder(elder);

		// Defines the steps for investigation (partially overridable):
		elderOne.setInvestigated(true);
		lookForClues();
		System.out.println("I see your name is " + elderOne.getName());
		System.out.println("I describe you as " + elderOne.getDescription());

		return elderOne;
	}

	public void lookForClues() {
		System.out.println("*** I am looking for an Elder One.");
	}


	protected abstract ElderOne createElder(Elders elder);

}
