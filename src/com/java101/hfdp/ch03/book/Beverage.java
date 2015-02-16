/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch03/book/Beverage.java#1 $
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
public abstract class Beverage {

	private String description;
	private boolean milk;
	private boolean soy;
	private boolean mocha;
	private boolean whip;


	protected Beverage(String description) {
		this.description = description;
	}


	public abstract long costInCents();


	protected long calculateAddOnCents() {
		long addOnCost = 0;

		if (isMilk()) {
			addOnCost += 30;
		}

		if (isSoy()) {
			addOnCost += 25;
		}

		if (isMocha()) {
			addOnCost += 75;
		}

		if (isWhip()) {
			addOnCost += 40;
		}

		return addOnCost;
	}


	public String getDescription() {
		return description;
	}


	public boolean isMilk() {
		return milk;
	}


	public void setMilk(boolean milk) {
		this.milk = milk;
	}


	public boolean isSoy() {
		return soy;
	}


	public void setSoy(boolean soy) {
		this.soy = soy;
	}


	public boolean isMocha() {
		return mocha;
	}


	public void setMocha(boolean mocha) {
		this.mocha = mocha;
	}


	public boolean isWhip() {
		return whip;
	}


	public void setWhip(boolean whip) {
		this.whip = whip;
	}
}
