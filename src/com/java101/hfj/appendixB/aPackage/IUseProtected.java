/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/appendixB/aPackage/IUseProtected.java#1 $
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
public class IUseProtected {

	private String myName = "Tom";


	public String getMyName() {
		return myName;
	}


	protected void setMyName(String myName) {
		this.myName = myName;
	}
}
