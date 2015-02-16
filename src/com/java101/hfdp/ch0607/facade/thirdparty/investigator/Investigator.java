/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch0607/facade/thirdparty/investigator/Investigator.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch0607.facade.thirdparty.investigator;

import com.java101.hfdp.ch04.elders.ElderOne;
import com.java101.hfdp.ch04.elders.characteristic.Elders;

/**
 *  Abstract base class for operations on a type of elder one.
 *  This class uses the Factory Method pattern.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/24 15:44:49 $ by $Author: crosta $	
 */
public abstract class Investigator {

	/**
	 * Typical actions for an {@link com.java101.hfdp.ch04.elders.ElderOne}.
	 *
	 * In this example, these instructions are unchangeable.
	 *
	 * @param elder
	 * 	elder to operate on.
	 *
	 * @return
	 * 	a concrete {@link com.java101.hfdp.ch04.elders.ElderOne} of the appropriate type, transformed as appropriate.
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
