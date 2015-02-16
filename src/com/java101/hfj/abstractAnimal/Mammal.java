/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/abstractAnimal/Mammal.java#1 $
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
public abstract class Mammal extends Animal {

	@Override
	public String makeNoise() {
		return "mammal groan";
	}


	@Override
	public String roam() {
		return "moving like a mammal!";
	}
}
