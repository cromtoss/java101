/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch0607/adapter/NoPowerSwitchable.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch0607.adapter;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/21 12:02:18 $ by $Author: crosta $	
 */
public final class NoPowerSwitchable implements PowerSwitchable {

	@Override
	public void off() {
		return;
	}


	@Override
	public void on() {
		return;
	}
}
