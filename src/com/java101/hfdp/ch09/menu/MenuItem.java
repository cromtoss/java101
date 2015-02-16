/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch09/menu/MenuItem.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch09.menu;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/05/05 13:16:43 $ by $Author: crosta $	
 */
final class MenuItem extends MenuComposite {

	private final boolean vegetarian;
	private final double price;

	public MenuItem(String name, String description, boolean vegetarian, double price) {
		super(name, description);
		this.vegetarian = vegetarian;
		this.price = price;
	}


	@Override
	double getPrice() {
		return price;
	}


	@Override
	boolean isVegetarian() {
		return vegetarian;
	}


	@Override
	public void print() {
		System.out.print("  " + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("     -- " + getDescription());
	}
}
