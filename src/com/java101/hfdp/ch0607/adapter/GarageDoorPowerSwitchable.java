/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch0607/adapter/GarageDoorPowerSwitchable.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch0607.adapter;

import com.java101.hfdp.ch0607.appliance.GarageDoor;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/21 12:02:18 $ by $Author: crosta $	
 */
public final class GarageDoorPowerSwitchable implements PowerSwitchable {

	private GarageDoor garageDoor;


	public GarageDoorPowerSwitchable(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}


	@Override
	public void off() {
		garageDoor.down();
	}


	@Override
	public void on() {
		garageDoor.up();
	}
}
