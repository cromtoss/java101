/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch04/factoryMethod/investigator/InvestigatorIntrepid.java#2 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch04.factoryMethod.investigator;

import com.java101.hfdp.ch04.elders.ElderOne;
import com.java101.hfdp.ch04.elders.characteristic.Elders;
import com.java101.hfdp.ch04.staticMethod.ElderOneStaticFactory;

/**
 *  Creates elders using the static factory.
 *
 *  @author Tom Cross
 *  @version $Revision: #2 $ submitted $DateTime: 2014/03/27 10:22:39 $ by $Author: crosta $	
 */
public final class InvestigatorIntrepid extends Investigator {

	@Override
	protected ElderOne createElder(Elders elder) {
		return ElderOneStaticFactory.create(elder);
	}
}
