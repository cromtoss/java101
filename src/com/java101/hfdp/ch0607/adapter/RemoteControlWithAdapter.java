/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch0607/adapter/RemoteControlWithAdapter.java#1 $
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
public final class RemoteControlWithAdapter {

	private PowerSwitchable[] slots;
	private PowerSwitchable	  undoSwitchable;
	private boolean			  isLastActionOn;


	public RemoteControlWithAdapter() {
		slots = new PowerSwitchable[7];

		PowerSwitchable noop = new NoPowerSwitchable();
		for(int i=0;i<7;i++) {
			slots[i] = noop;
		}
		undoSwitchable = noop;
	}

	public void setCommand(int slot, PowerSwitchable powerSwitchable) {
		slots[slot] = powerSwitchable;
	}

	public void onButtonWasPushed(int slotIndex) {
		slots[slotIndex].on();
	}

	public void offButtonWasPushed(int slotIndex) {
		slots[slotIndex].off();
	}

//	public void undoButtonWasPushed() {
//		undoCommand.undo();
//	}

	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < slots.length; i++) {
			stringBuff.append("[slot " + i + "] " + slots[i].getClass().getName() + "\n");
		}
		stringBuff.append("[undo] " + undoSwitchable.getClass().getName() + "\n");
		return stringBuff.toString();
	}


}
