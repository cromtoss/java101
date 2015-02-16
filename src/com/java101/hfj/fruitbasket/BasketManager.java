/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/fruitbasket/BasketManager.java#1 $
 *
 *	Copyright � 2012 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.fruitbasket;

import java.util.ArrayList;
import java.util.List;

/**
 *	//tcTODO
 *
 *	@author Tom "Sweet Sassy Molassy" Cross
 *	@version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */

public final class BasketManager {

	private List<Basket> baskets = new ArrayList<Basket>(3);

	public BasketManager() {
		final List<Fruit> fruitsOne = new ArrayList<Fruit>(2);
		fruitsOne.add(new Apple());
		fruitsOne.add(new Orange());
		final Basket basketOne = new BasketImpl(1, fruitsOne);

		final List<Fruit> fruitsTwo = new ArrayList<Fruit>(2);
		fruitsTwo.add(new Apple());
		fruitsTwo.add(new Apple());
		final Basket basketTwo = new BasketImpl(2, fruitsTwo);

		baskets.add(basketOne);
		baskets.add(basketTwo);
	}

	public Basket getBasketNumber(int ordinal) {return baskets.get(ordinal-1);}

}
