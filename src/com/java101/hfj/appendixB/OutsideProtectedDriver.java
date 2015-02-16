/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/appendixB/OutsideProtectedDriver.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.appendixB;

import com.java101.hfj.appendixB.aPackage.IUseProtected;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public class OutsideProtectedDriver {


	public static void main(String[] args) {

		//tcTODO uncomment me for demo
		MyUseProtected pro = new MyUseProtected();

		System.out.println("Hello, my name is " + pro.getMyName());

		pro.setMyName("Jim");
		System.out.println("Now my name is " + pro.getMyName());
	}

	//tcTODO extend IUseProtected
	public static class MyUseProtected extends IUseProtected {
		@Override
		protected void setMyName(String myName) {
			super.setMyName(myName);
		}
	}
}
