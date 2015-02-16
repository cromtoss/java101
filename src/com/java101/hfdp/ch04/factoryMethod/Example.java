/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch04/factoryMethod/Example.java#2 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch04.factoryMethod;

import com.java101.hfdp.ch04.elders.ElderOne;
import com.java101.hfdp.ch04.elders.characteristic.Elders;
import com.java101.hfdp.ch04.factoryMethod.investigator.InvestigatorIntrepid;
import com.java101.hfdp.ch04.factoryMethod.investigator.InvestigatorIntuitive;

/**
 * 	Example: using objects that leverage Factory Method pattern.
 *
 *  @author Tom Cross
 *  @version $Revision: #2 $ submitted $DateTime: 2014/03/27 10:22:39 $ by $Author: crosta $	
 */
public final class Example {

	public static void main(String[] args) {
		final InvestigatorIntrepid intrepid = new InvestigatorIntrepid();
		final InvestigatorIntuitive intuitive = new InvestigatorIntuitive();

		final ElderOne ithaqua = intrepid.investigate(Elders.ITHAQUA);
		final ElderOne yig = intuitive.investigate(Elders.YIG);

		System.out.println("Is Ithaqua investigated?: " + ithaqua.isInvestigated());
		System.out.println("Is Yig investigated?: " + yig.isInvestigated());
	}
}
