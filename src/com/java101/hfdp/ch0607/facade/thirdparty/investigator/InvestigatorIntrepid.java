/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch0607/facade/thirdparty/investigator/InvestigatorIntrepid.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch0607.facade.thirdparty.investigator;

import com.java101.hfdp.ch04.elders.ElderOne;
import com.java101.hfdp.ch04.elders.characteristic.Elders;
import com.java101.hfdp.ch04.staticMethod.ElderOneStaticFactory;

/**
 *  Creates elders using the static factory.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/24 15:44:49 $ by $Author: crosta $	
 */
public final class InvestigatorIntrepid extends Investigator {

	@Override
	protected ElderOne createElder(Elders elder) {
		return ElderOneStaticFactory.create(elder);
	}
}
