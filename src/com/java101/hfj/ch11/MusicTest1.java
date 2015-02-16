/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/ch11/MusicTest1.java#1 $
 *
 *	Copyright � 2013 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.ch11;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public class MusicTest1 {

	public void tom() throws TomsException {
	}

	public void play() throws TomsException {

		try {
			//getLockForAThing();
			tom();
		} finally {
			//releaseLockForAThing();
		}
		System.out.println("Got a reference to a sequencer!");

		// sequencer.playTheJamMan();
	}


	public static void main(String[] args) throws Exception {
		MusicTest1 myTest = new MusicTest1();
		myTest.play();
	}

}
