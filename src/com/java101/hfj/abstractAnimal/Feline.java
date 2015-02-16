/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/abstractAnimal/Feline.java#1 $
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
public abstract class Feline extends Mammal {

	@Override
	public String makeNoise() {
		return "meow";
	}


	@Override
	public String eat() {
		return "cat chomp!";
	}


	@Override
	public String sleep() {
		return "catnap";
	}


	@Override
	public String roam() {
		return "stalk the jungle";
	}
}
