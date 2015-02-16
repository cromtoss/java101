/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/inheritance/Zoo.java#1 $
 *
 *	Copyright � 2013 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.inheritance;

import java.util.ArrayList;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public class Zoo {


	public static void main(String[] args) {

		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(new Frog());
		animals.add(new Hippo());
		animals.add(new Tuna());

		for (Animal animal : animals) {
			System.out.println(animal.eat());
			System.out.println(animal.getNoise());
		}
	}

}
