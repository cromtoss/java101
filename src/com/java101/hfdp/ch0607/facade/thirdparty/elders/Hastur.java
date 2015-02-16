/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch0607/facade/thirdparty/elders/Hastur.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch0607.facade.thirdparty.elders;

import com.java101.hfdp.ch0607.facade.thirdparty.elders.characteristic.AllStarTeam;
import com.java101.hfdp.ch0607.facade.thirdparty.elders.characteristic.Elders;
import com.java101.hfdp.ch0607.facade.thirdparty.elders.characteristic.Position;

/**
 *  Represents the King in Yellow, who is awake, insanity causing, and world eating.
 *  Yikes.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/24 15:44:49 $ by $Author: crosta $	
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
