/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/appendixB/aPackage/ProtectedDriver.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.appendixB.aPackage;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public class ProtectedDriver {

	public static void main(String[] args) {
		IUseProtected pro = new IUseProtected();

		final StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hello, my name is ");
		stringBuilder.append(pro.getMyName());
		System.out.println(stringBuilder.toString());

		pro.setMyName("Jim");
		System.out.println("Now my name is " + pro.getMyName());
	}

}
