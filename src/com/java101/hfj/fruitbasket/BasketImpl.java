/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/fruitbasket/BasketImpl.java#1 $
 *
 *	Copyright � 2012 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.fruitbasket;

import java.util.Collections;
import java.util.List;

/**
 *	//tcTODO
 *
 *	@author Tom "Sweet Sassy Molassy" Cross
 *	@version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */

public final class BasketImpl implements Basket {

	private final int 			ordinal;
	private final List<Fruit> 	fruits;


	public BasketImpl(int ordinal, List<Fruit> fruits) {
		this.ordinal = ordinal;
		this.fruits = fruits;
	}


	public int getOrdinal() {
		return ordinal;
	}


	public List<Fruit> getContents() {
		return Collections.unmodifiableList(fruits);
	}

}
