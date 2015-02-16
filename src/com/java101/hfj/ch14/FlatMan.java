/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/ch14/FlatMan.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.ch14;

import java.io.Serializable;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public final class FlatMan implements Serializable {

	private static final long serialVersionUID = 0L;

	private static int staticCounter = 0;

	private String name;
	private transient int age;


	public FlatMan(String name, int age) {
		this.name = name;
		this.age = age;

		staticCounter++;
	}

	public static int getStaticCounter() {
		return staticCounter;
	}


	public static void incrementStaticCounter() {
		staticCounter++;
	}


	@Override
	public String toString() {
		return "My name is " + name + " and I " +
			((age > 0)
				? "am " + age + " years old."
				: "am strange.");
	}
}
