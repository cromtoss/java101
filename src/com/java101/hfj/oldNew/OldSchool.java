/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/oldNew/OldSchool.java#1 $
 *
 *	Copyright � 2013 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.oldNew;


import com.java101.hfj.adhoc.Hippo;

import java.util.ArrayList;
import java.util.Date;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public class OldSchool {

	public static void main(String[] args) {

		ArrayList oldSchool = new ArrayList();

		Date d = null;

		Integer i = 19;
		Integer j = 25;

		oldSchool.add(i);
		oldSchool.add(j);
		oldSchool.add(new Hippo());

		Integer accessed = (Integer) oldSchool.get(0);

		if (oldSchool == null && oldSchool.size() > 6) {

		}

		int total = 0;
		for (Object obj : oldSchool) {
			Integer theInteger = (Integer) obj;
			total += theInteger;
		}

		System.out.println(total);
	}

}
