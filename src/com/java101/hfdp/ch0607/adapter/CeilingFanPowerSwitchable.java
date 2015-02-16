/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch0607/adapter/CeilingFanPowerSwitchable.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch0607.adapter;

import com.java101.hfdp.ch0607.appliance.CeilingFan;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/21 12:02:18 $ by $Author: crosta $	
 */
public final class CeilingFanPowerSwitchable implements PowerSwitchable {

	private CeilingFan ceilingFan;


	public CeilingFanPowerSwitchable(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}


	@Override
	public void off() {
		ceilingFan.off();
	}


	@Override
	public void on() {
		ceilingFan.medium();
	}
}
