/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch09/Waitress.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch09;

import com.java101.hfdp.ch09.menu.Menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/05/05 13:16:43 $ by $Author: crosta $	
 */
public final class Waitress {

	private List<Menu> menus = new ArrayList<>();


	public Waitress(Menu menu) {
		menus.add(menu);
	}

	public Waitress(Menu... menu) {
		menus.addAll(Arrays.asList(menu));
	}


	public void printMenu() {
		for (Menu menu : menus) {
			menu.print();
		}
	}
}
