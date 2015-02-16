/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch09/Example.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/05/05 13:16:43 $ by $Author: crosta $	
 */
public final class Example {


	public static void main(String[] args) {
		final ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
				"com/java101/hfdp/ch09/applicationContext.xml"
		});

//		Waitress waitress = context.getBean("waitress", Waitress.class);
//		waitress.printMenu();

		Waitress another = context.getBean("anotherWaitress", Waitress.class);
		another.printMenu();
	}
}
