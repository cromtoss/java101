/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch0607/facade/thirdparty/investigator/InvestigatorIntuitive.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch0607.facade.thirdparty.investigator;

import com.java101.hfdp.ch04.elders.ElderOne;
import com.java101.hfdp.ch04.elders.characteristic.Elders;
import com.java101.hfdp.ch04.simpleFactory.ElderOneFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  Creates elders using the Simple Factory pattern.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/24 15:44:49 $ by $Author: crosta $	
 */
public final class InvestigatorIntuitive extends Investigator {

	@Override
	protected ElderOne createElder(Elders elder) {
		final ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
				"com/java101/hfdp/ch04/simpleFactory/simpleFactoryApplicationContext.xml"
		});
		final ElderOneFactory factory = context.getBean(ElderOneFactory.class);
		return factory.create(elder);
	}


	@Override
	public void lookForClues() {
		System.out.println("*** I am using mystic mind powers to seek a Great Old One.");
	}
}
