/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch04/abstractFactory/Example.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch04.abstractFactory;

import com.java101.hfdp.ch04.abstractFactory.investigator.Investigator;
import com.java101.hfdp.ch04.abstractFactory.investigator.InvestigatorIntrepid;
import com.java101.hfdp.ch04.abstractFactory.investigator.InvestigatorIntuitive;
import com.java101.hfdp.ch04.elders.ElderOne;
import com.java101.hfdp.ch04.elders.characteristic.Position;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 	Example: using objects that leverage Abstract Factory pattern.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/27 10:22:39 $ by $Author: crosta $	
 */
public final class Example {

	public static void main(String[] args) {
		
		// Create the Spring container (or context) and have it create all of the objects
		// we want to use. These are the "beans."
		final ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
				"com/java101/hfdp/ch04/abstractFactory/abstractFactoryApplicationContext.xml"
		});		

		final Investigator intrepid = context.getBean(InvestigatorIntrepid.class);
		final Investigator intuitive = context.getBean(InvestigatorIntuitive.class);

		final ElderOne westernCenter = intrepid.investigate(Position.CENTER);
		final ElderOne easternForward = intuitive.investigate(Position.FORWARD);

		System.out.println(westernCenter.toString());
		System.out.println(easternForward.toString());
	}
}
