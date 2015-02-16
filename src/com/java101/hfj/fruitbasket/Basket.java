/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/fruitbasket/Basket.java#1 $
 *
 *	Copyright � 2012 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.fruitbasket;

import java.util.List;

/**
 *	//tcTODO
 *
 *	@author Tom "Sweet Sassy Molassy" Cross
 *	@version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */

public interface Basket {

	int getOrdinal(); //returns 1, 2, or 3. Cannot be changed.

	List<Fruit> getContents();

}
