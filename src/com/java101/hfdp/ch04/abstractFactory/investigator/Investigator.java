/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch04/abstractFactory/investigator/Investigator.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch04.abstractFactory.investigator;

import com.java101.hfdp.ch04.abstractFactory.factory.ElderFactory;
import com.java101.hfdp.ch04.elders.ElderOne;
import com.java101.hfdp.ch04.elders.characteristic.AllStarTeam;
import com.java101.hfdp.ch04.elders.characteristic.Position;

/**
 *  Abstract base class for operations on a type of elder one.
 *  This class uses the Factory Method pattern.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/27 10:22:39 $ by $Author: crosta $	
 */
public abstract class Investigator {

	private ElderFactory elderFactory;


	protected Investigator(ElderFactory elderFactory) {
		this.elderFactory = elderFactory;
	}


	protected AllStarTeam getAllStarTeam() {
		return elderFactory.getAllStarTeam();
	}


	/**
	 * Typical actions for investigating an {@link com.java101.hfdp.ch04.elders.ElderOne}.
	 *
	 * In this example, these instructions are unchangeable.
	 *
	 * @param position
	 * 	elder to operate on.
	 *
	 * @return
	 * 	a concrete {@link com.java101.hfdp.ch04.elders.ElderOne} of the appropriate type, transformed as appropriate.
	 */
	public final ElderOne investigate(Position position) {
		final ElderOne elderOne = elderFactory.create(position);

		// Defines the steps for investigation (partially overridable):
		elderOne.setInvestigated(true);
		lookForPosition(position);
		System.out.println("I see your name is " + elderOne.getName());
		System.out.println("I describe you as " + elderOne.getDescription());

		return elderOne;
	}


	public void lookForPosition(Position position) {
		System.out.println("*** I am looking for the " + position + " from the " + getAllStarTeam() + " team.");
	}


}
