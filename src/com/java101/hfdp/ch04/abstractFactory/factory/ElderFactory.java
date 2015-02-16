/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch04/abstractFactory/factory/ElderFactory.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch04.abstractFactory.factory;

import com.java101.hfdp.ch04.elders.ElderOne;
import com.java101.hfdp.ch04.elders.characteristic.AllStarTeam;
import com.java101.hfdp.ch04.elders.characteristic.Position;

/**
 *  Abstract factory interface.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/27 10:22:39 $ by $Author: crosta $	
 */
public interface ElderFactory {

	ElderOne create(Position position);

	AllStarTeam getAllStarTeam();

}
