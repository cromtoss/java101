/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch09/menu/MenuNode.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch09.menu;

import java.util.ArrayList;
import java.util.List;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/05/05 13:16:43 $ by $Author: crosta $	
 */
final class MenuNode extends MenuComposite {

	private List<MenuComposite> children = new ArrayList<>();


	public MenuNode(String name, String description, MenuComposite... items) {
		super(name, description);

		for (MenuComposite item : items) {
			add(item);
		}
	}


	@Override
	void add(MenuComposite composite) {
		children.add(composite);
	}


	@Override
	void remove(MenuComposite composite) {
		children.remove(composite);
	}


	@Override
	MenuComposite getChild(int index) {
		return children.get(index);
	}


	@Override
	public void print() {
		System.out.print("\nMenu: " + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");

		for (MenuComposite child : children) {
			child.print();
		}
	}
}
