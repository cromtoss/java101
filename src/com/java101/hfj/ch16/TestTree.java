/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/ch16/TestTree.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.ch16;

import java.util.TreeSet;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public class TestTree {

	public static void main(String[] args) {
		new TestTree().go(); //good way to run a non-static method from a static execution harness
	}


	public void go() {
		Book b1 = new Book("How Cats Work", "Barry Svee");
		Book b2 = new Book("Remix Your Body", "Jon Jumbo Skarphol");
		Book b3 = new Book("Finding Emo", "Tom Cross");

		TreeSet<Book> tree = new TreeSet<>();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		System.out.println(tree);
	}
}
