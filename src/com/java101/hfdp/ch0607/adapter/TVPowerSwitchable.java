/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch0607/adapter/TVPowerSwitchable.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch0607.adapter;

import com.java101.hfdp.ch0607.appliance.TV;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/21 12:02:18 $ by $Author: crosta $	
 */
public final class TVPowerSwitchable implements PowerSwitchable {

	private TV television;


	public TVPowerSwitchable(TV television) {
		this.television = television;
	}

	// Note that if we had direct access to TV we could just make it directly
	// implement PowerSwitchable!

	@Override
	public void off() {
		television.off();
	}


	@Override
	public void on() {
		television.on();
	}
}
