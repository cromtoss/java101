/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/oldNew/Parameterized.java#1 $
 *
 *	Copyright � 2013 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.oldNew;

import java.util.ArrayList;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public class Parameterized {

	public static void main(String[] args) {

		ArrayList<Integer> newAndImproved = new ArrayList<>();

		int i = 19;
		int j = 25;

		newAndImproved.add(i);
		newAndImproved.add(j);
//		oldSchool.add(new Hippo());

		int accessed = newAndImproved.get(0);

		int total = 0;
		for (int x : newAndImproved) {
			total += x;
		}

		System.out.println(total);
	}
}
