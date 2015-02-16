/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/fruitbasket/Main.java#1 $
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
public final class Main {

	public static String analyzeBaskets(BasketManager manager) {

		final Basket firstBasket = manager.getBasketNumber(1);
		for (Fruit fruit : firstBasket.getContents()) {
			if (fruit instanceof Orange) {
				final BasketLabel[] printLabels = {BasketLabel.BOTH, BasketLabel.APPLES};
				return print(printLabels);
			}
		}

		final BasketLabel[] printLabels = {BasketLabel.APPLES, BasketLabel.BOTH};
		return print(printLabels);
	}


	private static String print(BasketLabel[] orderToPrint) {
		return "1: " + orderToPrint[0].getPrintLabel() + ", 2: " + orderToPrint[1].getPrintLabel();
	}


	public static final void main(String[] args) {
		final BasketManager manager = new BasketManager();
		System.out.println(Main.analyzeBaskets(manager));
	}

}
