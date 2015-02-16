/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch04/simpleFactory/Example.java#3 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch04.simpleFactory;

import com.java101.hfdp.ch04.elders.ElderOne;
import com.java101.hfdp.ch04.elders.characteristic.Elders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  Example showing the simple factory.
 *
 *  @author Tom Cross
 *  @version $Revision: #3 $ submitted $DateTime: 2014/03/27 10:22:39 $ by $Author: crosta $	
 */
public final class Example {

	/**
	 * Example of a Spring-injected factory and a typical simple factory.
	 *
	 * @param args
	 * 	not used
	 */
	public static void main(String[] args) {

		// Let's use Spring instead of just doing this:
//		final ElderOneFactory factory = new ElderOneFactory();

		// Create the Spring container (or context) and have it create all of the objects
		// we want to use. These are the "beans."
		final ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
				"com/java101/hfdp/ch04/simpleFactory/simpleFactoryApplicationContext.xml"
		});
		final ElderOneFactory factory = context.getBean(ElderOneFactory.class);

		final ElderOne hastur = factory.create(Elders.HASTUR);

		System.out.println("Hi, I'm " + hastur.getName() + ", but call me " + hastur.getNickname() + ".");
	}

}
