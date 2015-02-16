/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch05/singleton3/SpringSingletonExample.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch05.singleton3;

import com.java101.hfdp.ch05.elders.Azathoth;
import com.java101.hfdp.ch05.elders.Hastur;
import com.java101.hfdp.ch05.elders.Yig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  Example showing singletons in Spring.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/14 11:45:26 $ by $Author: crosta $	
 */
public final class SpringSingletonExample {

	/**
	 * Example of using Spring to get singletons.
	 *
	 * @param args
	 * 	not used
	 */
	public static void main(String[] args) {
		// Create the Spring container (or context) and have it create all of the objects
		// we want to use. These are the "beans."
		final ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
				"com/java101/hfdp/ch05/singleton3/applicationContext.xml"
		});

		final SpringSingleton singleton1 = context.getBean(SpringSingleton.class);
		final Yig yig = context.getBean(Yig.class);
		singleton1.addCapturedElder(yig);

		final SpringSingleton singleton2 = context.getBean(SpringSingleton.class);
		final Azathoth azathoth = context.getBean(Azathoth.class);
		singleton2.addCapturedElder(azathoth);

		final SpringSingleton singleton3 = context.getBean(SpringSingleton.class);
		final Hastur hastur = context.getBean(Hastur.class);
		singleton3.addCapturedElder(hastur);

		final Hastur hastur2 = context.getBean(Hastur.class);
		singleton1.addCapturedElder(hastur2);

		final Hastur hastur3 = context.getBean(Hastur.class);
		singleton2.addCapturedElder(hastur3);

		System.out.println("Singleton 1 contents: " + singleton1.toString());
		System.out.println("Singleton 2 contents: " + singleton2.toString());
		System.out.println("Singleton 3 contents: " + singleton3.toString());
	}

}
