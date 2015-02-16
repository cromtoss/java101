/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/inheritance/Animal.java#1 $
 *
 *	Copyright � 2013 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.inheritance;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public class Animal {

	private String noise;
	private String eatSound = "Nom nom nom!";


	public String eat() {
		return eatSound;
	}

	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}

}
