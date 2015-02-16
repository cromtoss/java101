/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch03/elderOnes/Yig.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch03.elderOnes;

/**
 *  Represents Yig, an awake, harmless elder one (non-world-eating) insanity causer.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/13 21:53:19 $ by $Author: crosta $	
 */
public final class Yig extends ElderOne {

	public Yig(String name, String nickname, String author, String description) {
		setName(name);
		setNickname(nickname);
		setAuthor(author);
		setDescription(description);
	}


	@Override
	public void wreakHavoc() {
		System.out.println("Yig the serpent king");
	}
}
