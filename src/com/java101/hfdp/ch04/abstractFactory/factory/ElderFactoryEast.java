/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch04/abstractFactory/factory/ElderFactoryEast.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch04.abstractFactory.factory;

import com.java101.hfdp.ch04.elders.Azathoth;
import com.java101.hfdp.ch04.elders.ElderOne;
import com.java101.hfdp.ch04.elders.Ithaqua;
import com.java101.hfdp.ch04.elders.Tsathoggua;
import com.java101.hfdp.ch04.elders.characteristic.AllStarTeam;
import com.java101.hfdp.ch04.elders.characteristic.Position;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *  Returns the eastern all-star team.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/27 10:22:39 $ by $Author: crosta $	
 */
@Component
public final class ElderFactoryEast implements ElderFactory {

	private Azathoth azathoth;
	private Ithaqua ithaqua;
	private Tsathoggua tsathoggua;


	@Autowired
	public ElderFactoryEast(Azathoth azathoth, Ithaqua ithaqua, Tsathoggua tsathoggua) {
		this.azathoth = azathoth;
		this.ithaqua = ithaqua;
		this.tsathoggua = tsathoggua;
	}


	@Override
	public ElderOne create(Position position) {
		if (position == Position.CENTER) {
			return ithaqua;
		} else if (position == Position.FORWARD) {
			return tsathoggua;
		} else if (position == Position.GUARD) {
			return azathoth;
		} else {
			throw new IllegalArgumentException("Position " + position + " is not yet supported.");
		}
	}


	@Override
	public AllStarTeam getAllStarTeam() {
		return AllStarTeam.EAST;
	}
}
