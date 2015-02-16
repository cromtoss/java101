/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch03/elderOnes/Cthulhu.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch03.elderOnes;

/**
 *  Represents Cthulhu, an asleep, insanity-causing, world-eater.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/13 21:53:19 $ by $Author: crosta $	
 */
public final class Cthulhu extends ElderOne {


	public Cthulhu(String name, String nickname, String author, String description) {
		setName(name);
		setNickname(nickname);
		setAuthor(author);
		setDescription(description);
	}


	@Override
	public void wreakHavoc() {
		System.out.println("The Dread Cthulhu");
	}
}
