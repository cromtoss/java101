/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch05/elders/Azathoth.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch05.elders;

import com.java101.hfdp.ch05.elders.characteristic.AllStarTeam;
import com.java101.hfdp.ch05.elders.characteristic.Elders;
import com.java101.hfdp.ch05.elders.characteristic.Position;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/14 11:45:26 $ by $Author: crosta $	
 */
public final class Azathoth extends ElderOne {

	public Azathoth(String name, String nickname, String author, String description) {
		super(Elders.AZATHOTH);

		setName(name);
		setNickname(nickname);
		setAuthor(author);
		setDescription(description);

		setAllStarTeam(AllStarTeam.EAST);
		setPosition(Position.GUARD);
	}
}
