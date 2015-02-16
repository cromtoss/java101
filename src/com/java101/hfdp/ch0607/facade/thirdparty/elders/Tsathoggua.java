/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch0607/facade/thirdparty/elders/Tsathoggua.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch0607.facade.thirdparty.elders;


import com.java101.hfdp.ch0607.facade.thirdparty.elders.characteristic.AllStarTeam;
import com.java101.hfdp.ch0607.facade.thirdparty.elders.characteristic.Elders;
import com.java101.hfdp.ch0607.facade.thirdparty.elders.characteristic.Position;

/**
 *  Represents Tsathoggua, an asleep, harmless (non-world-eating) insanity causer.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/24 15:44:49 $ by $Author: crosta $	
 */
public final class Tsathoggua extends ElderOne {

	public Tsathoggua(String name, String nickname, String author, String description) {
		super(Elders.TSATHOGGUA);

		setName(name);
		setNickname(nickname);
		setAuthor(author);
		setDescription(description);

		setAllStarTeam(AllStarTeam.EAST);
		setPosition(Position.FORWARD);
	}

}
