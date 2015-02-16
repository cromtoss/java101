/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch04/abstractFactory/factory/ElderFactoryWest.java#2 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch04.abstractFactory.factory;

import com.java101.hfdp.ch04.elders.Cthulhu;
import com.java101.hfdp.ch04.elders.ElderOne;
import com.java101.hfdp.ch04.elders.Hastur;
import com.java101.hfdp.ch04.elders.Yig;
import com.java101.hfdp.ch04.elders.characteristic.AllStarTeam;
import com.java101.hfdp.ch04.elders.characteristic.Position;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *  Returns the western all-star team.
 *
 *  @author Tom Cross
 *  @version $Revision: #2 $ submitted $DateTime: 2014/04/14 11:45:26 $ by $Author: crosta $	
 */
@Component(value = "elderFactoryRad")
public final class ElderFactoryWest implements ElderFactory {

	private Cthulhu cthulhu;
	private Hastur hastur;
	private Yig yig;


	@Autowired
	public ElderFactoryWest(Cthulhu cthulhu, Hastur hastur, Yig yig) {
		this.cthulhu = cthulhu;
		this.hastur = hastur;
		this.yig = yig;
	}


	@Override
	public ElderOne create(Position position) {
		if (position == Position.CENTER) {
			return cthulhu;
		} else if (position == Position.FORWARD) {
			return hastur;
		} else if (position == Position.GUARD) {
			return yig;
		} else {
			throw new IllegalArgumentException("Position " + position + " is not yet supported.");
		}
	}


	@Override
	public AllStarTeam getAllStarTeam() {
		return AllStarTeam.WEST;
	}
}
