/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch04/abstractFactory/investigator/InvestigatorIntuitive.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch04.abstractFactory.investigator;

import com.java101.hfdp.ch04.abstractFactory.factory.ElderFactory;
import com.java101.hfdp.ch04.elders.characteristic.Position;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *  Investigates elder ones intuitively.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/27 10:22:39 $ by $Author: crosta $	
 */
@Component
public final class InvestigatorIntuitive extends Investigator {

	@Autowired
	public InvestigatorIntuitive(
		@Qualifier("elderFactoryEast") ElderFactory elderFactory
	) {
		super(elderFactory);
	}


	@Override
	public void lookForPosition(Position position) {
		System.out.println("*** I am using mystic mind powers to seek the " + position + " from the " + getAllStarTeam() + " team.");
	}
}
