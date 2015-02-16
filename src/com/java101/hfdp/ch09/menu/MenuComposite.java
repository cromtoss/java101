/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch09/menu/MenuComposite.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch09.menu;

/**
 *  Composite Pattern: typical base class.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/05/05 13:16:43 $ by $Author: crosta $	
 */
abstract class MenuComposite implements Menu {

	private String name;
	private String description;


	protected MenuComposite(String name, String description) {
		this.name = name;
		this.description = description;
	}


	public String getDescription() {
		return description;
	}


	public String getName() {
		return name;
	}


	void add(MenuComposite composite) {
		throw new UnsupportedOperationException();
	}


	void remove(MenuComposite composite) {
		throw new UnsupportedOperationException();
	}


	MenuComposite getChild(int index) {
		throw new UnsupportedOperationException();
	}


	double getPrice() {
		throw new UnsupportedOperationException();
	}


	boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

}
