/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch04/abstractFactory/investigator/InvestigatorIntrepid.java#2 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch04.abstractFactory.investigator;

import com.java101.hfdp.ch04.abstractFactory.factory.ElderFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *  Investigates elder ones intrepidly.
 *
 *  @author Tom Cross
 *  @version $Revision: #2 $ submitted $DateTime: 2014/04/14 11:45:26 $ by $Author: crosta $	
 */
@Component
public final class InvestigatorIntrepid extends Investigator {

	@Autowired
	public InvestigatorIntrepid(
		@Qualifier("elderFactoryRad") ElderFactory elderFactory
	) {
		super(elderFactory);
	}
}
