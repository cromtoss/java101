/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch04/elders/Hastur.java#2 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch04.elders;

import com.java101.hfdp.ch04.elders.characteristic.AllStarTeam;
import com.java101.hfdp.ch04.elders.characteristic.Elders;
import com.java101.hfdp.ch04.elders.characteristic.Position;

/**
 *  Represents the King in Yellow, who is awake, insanity causing, and world eating.
 *  Yikes.
 *
 *  @author Tom Cross
 *  @version $Revision: #2 $ submitted $DateTime: 2014/03/27 10:22:39 $ by $Author: crosta $	
 */
public final class Hastur extends ElderOne {

	public Hastur(String name, String nickname, String author, String description) {
		super(Elders.HASTUR);

		setName(name);
		setNickname(nickname);
		setAuthor(author);
		setDescription(description);

		setAllStarTeam(AllStarTeam.WEST);
		setPosition(Position.FORWARD);
	}

}
