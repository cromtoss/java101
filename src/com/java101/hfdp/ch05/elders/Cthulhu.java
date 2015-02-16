/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch05/elders/Cthulhu.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch05.elders;


import com.java101.hfdp.ch05.elders.characteristic.AllStarTeam;
import com.java101.hfdp.ch05.elders.characteristic.Elders;
import com.java101.hfdp.ch05.elders.characteristic.Position;

/**
 *  Represents Cthulhu, an asleep, insanity-causing, world-eater.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/14 11:45:26 $ by $Author: crosta $	
 */
public final class Cthulhu extends ElderOne {


	public Cthulhu(String name, String nickname, String author, String description) {
		super(Elders.CTHULHU);

		setName(name);
		setNickname(nickname);
		setAuthor(author);
		setDescription(description);

		setAllStarTeam(AllStarTeam.WEST);
		setPosition(Position.CENTER);
	}



}
