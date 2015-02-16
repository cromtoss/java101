/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch0607/command/TVOffCommand.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch0607.command;

import com.java101.hfdp.ch0607.appliance.TV;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/21 12:02:18 $ by $Author: crosta $	
 */
public final class TVOffCommand implements Command {

	private TV television;


	public TVOffCommand(TV television) {
		this.television = television;
	}


	@Override
	public void execute() {
		television.off();
	}
}
