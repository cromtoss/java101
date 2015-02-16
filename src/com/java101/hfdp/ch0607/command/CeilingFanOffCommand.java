/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch0607/command/CeilingFanOffCommand.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch0607.command;

import com.java101.hfdp.ch0607.appliance.CeilingFan;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/21 12:02:18 $ by $Author: crosta $	
 */
public final class CeilingFanOffCommand implements Command {

	private CeilingFan ceilingFan;


	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}


	@Override
	public void execute() {
		ceilingFan.off();
	}
}
