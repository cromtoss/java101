/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch03/elderOnes/Hastur.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch03.elderOnes;

/**
 *  Represents the King in Yellow, who is awake, insanity causing, and world eating.
 *  Yikes.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/13 21:53:19 $ by $Author: crosta $	
 */
public final class Hastur extends ElderOne {

	public Hastur(String name, String nickname, String author, String description) {
		setName(name);
		setNickname(nickname);
		setAuthor(author);
		setDescription(description);
	}


	@Override
	public void wreakHavoc() {
		System.out.println("The King in Yellow");
	}
}
