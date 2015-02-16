/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch0607/Example.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch0607;

import com.java101.hfdp.ch0607.adapter.CeilingFanPowerSwitchable;
import com.java101.hfdp.ch0607.adapter.GarageDoorPowerSwitchable;
import com.java101.hfdp.ch0607.adapter.LightPowerSwitchable;
import com.java101.hfdp.ch0607.adapter.RemoteControlWithAdapter;
import com.java101.hfdp.ch0607.adapter.TVPowerSwitchable;
import com.java101.hfdp.ch0607.appliance.CeilingFan;
import com.java101.hfdp.ch0607.appliance.GarageDoor;
import com.java101.hfdp.ch0607.appliance.Light;
import com.java101.hfdp.ch0607.appliance.TV;
import com.java101.hfdp.ch0607.command.CeilingFanOffCommand;
import com.java101.hfdp.ch0607.command.CeilingFanOnCommand;
import com.java101.hfdp.ch0607.command.GarageDoorOffCommand;
import com.java101.hfdp.ch0607.command.GarageDoorOnCommand;
import com.java101.hfdp.ch0607.command.LightOffCommand;
import com.java101.hfdp.ch0607.command.LightOnCommand;
import com.java101.hfdp.ch0607.command.RemoteControlWithCommand;
import com.java101.hfdp.ch0607.command.TVOffCommand;
import com.java101.hfdp.ch0607.command.TVOnCommand;

/**
 *  Example using the Remote Control implemented either with Adapter or with Command.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/21 12:02:18 $ by $Author: crosta $	
 */
public final class Example {

	private static RemoteControlWithAdapter remoteWithAdapter = new RemoteControlWithAdapter();
	private static RemoteControlWithCommand remoteWithCommand = new RemoteControlWithCommand();

	private static CeilingFan ceilingFan = new CeilingFan();
	private static GarageDoor garageDoor = new GarageDoor();
	private static Light light = new Light();
	private static TV television = new TV();


	public static void main(String[] args) {
		testRemoteWithAdapter();
		testRemoteWithCommand();
	}


	private static void testRemoteWithAdapter() {
		CeilingFanPowerSwitchable fanPS = new CeilingFanPowerSwitchable(ceilingFan);
		GarageDoorPowerSwitchable garagePS = new GarageDoorPowerSwitchable(garageDoor);
		LightPowerSwitchable lightPS = new LightPowerSwitchable(light);
		TVPowerSwitchable televisionPS = new TVPowerSwitchable(television);

		remoteWithAdapter.setCommand(0, fanPS);
		remoteWithAdapter.setCommand(1, garagePS);
		remoteWithAdapter.setCommand(2, lightPS);
		remoteWithAdapter.setCommand(3, televisionPS);

		remoteWithAdapter.onButtonWasPushed(0);
		remoteWithAdapter.onButtonWasPushed(1);
		remoteWithAdapter.offButtonWasPushed(0);

		remoteWithAdapter.offButtonWasPushed(2);
		remoteWithAdapter.onButtonWasPushed(3);

		remoteWithAdapter.onButtonWasPushed(4);
	}


	private static void testRemoteWithCommand() {
		CeilingFanOnCommand fanOnCmd = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand fanOffCmd = new CeilingFanOffCommand(ceilingFan);

		GarageDoorOnCommand garageOnCmd = new GarageDoorOnCommand(garageDoor);
		GarageDoorOffCommand garageOffCmd = new GarageDoorOffCommand(garageDoor);

		LightOnCommand lightOnCmd = new LightOnCommand(light);
		LightOffCommand lightOffCmd = new LightOffCommand(light);

		TVOnCommand tvOnCmd = new TVOnCommand(television);
		TVOffCommand tvOffCmd = new TVOffCommand(television);

		remoteWithCommand.setCommand(0, fanOnCmd, fanOffCmd);
		remoteWithCommand.setCommand(1, garageOnCmd, garageOffCmd);
		remoteWithCommand.setCommand(2, lightOnCmd, lightOffCmd);
		remoteWithCommand.setCommand(3, tvOnCmd, tvOffCmd);

		remoteWithCommand.onButtonWasPushed(0);
		remoteWithCommand.onButtonWasPushed(1);
		remoteWithCommand.offButtonWasPushed(0);

		remoteWithCommand.offButtonWasPushed(2);
		remoteWithCommand.onButtonWasPushed(3);

		remoteWithCommand.onButtonWasPushed(4);
	}
}
