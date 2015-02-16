/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/abstractAnimal/Zoo.java#1 $
 *
 *	Copyright � 2013 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.abstractAnimal;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public final class Zoo {


	public static void main(String[] args) {

		// Try making a new Canine.

		// Try making a new Feline.

		// Look at implementation of Mammal & Hippo.
		Dog d = new Dog();
		Object myObject = printObject(d);


	}

	public static Object printObject(Object o) {
		System.out.println(o.toString());
		return o;
	}

}
