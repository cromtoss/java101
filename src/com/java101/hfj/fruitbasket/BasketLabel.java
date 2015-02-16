/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/fruitbasket/BasketLabel.java#1 $
 *
 *	Copyright � 2012 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.fruitbasket;

/**
 *	//tcTODO
 *
 *	@author Tom "Sweet Sassy Molassy" Cross
 *	@version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */

public enum BasketLabel {
	APPLES("Apples"),
	BOTH("Both");

	private final String printLabel;

	BasketLabel(String printLabel) {
		this.printLabel = printLabel;
	}

	String getPrintLabel() {return printLabel;}
}
