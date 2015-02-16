/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch0607/adapter/LightPowerSwitchable.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch0607.adapter;

import com.java101.hfdp.ch0607.appliance.Light;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/21 12:02:18 $ by $Author: crosta $	
 */
public final class LightPowerSwitchable implements PowerSwitchable {

	private Light light;


	public LightPowerSwitchable(Light light) {
		this.light = light;
	}


	@Override
	public void off() {
		light.darken();
	}


	@Override
	public void on() {
		light.illuminate();
	}
}

