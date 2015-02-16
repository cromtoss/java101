/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch03/book/HouseBlend.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch03.book;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/25 12:02:17 $ by $Author: crosta $	
 */
public final class HouseBlend extends Beverage {

	public HouseBlend() {
		super("House Blend");
	}


	@Override
	public long costInCents() {
		return 115 + calculateAddOnCents();
	}
}
