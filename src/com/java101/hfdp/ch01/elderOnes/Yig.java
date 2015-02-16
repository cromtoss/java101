/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch01/elderOnes/Yig.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch01.elderOnes;

import com.java101.hfdp.ch01.elderOnes.strategy.InsanityCauser;
import com.java101.hfdp.ch01.elderOnes.strategy.InsanityCauserImpl;

/**
 *  Represents Yig, an awake, harmless elder one (non-world-eating) insanity causer.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public final class Yig extends ElderOne implements InsanityCauser {

	private InsanityCauser insanityCauser = new InsanityCauserImpl();

	public Yig(String name, String nickname, String author, String description) {
		super(name, nickname, author, description);
	}


	@Override
	public void causeNightmares() {
		insanityCauser.causeNightmares();
	}


	@Override
	public void causeWakingVisions() {
		insanityCauser.causeWakingVisions();
	}


	@Override
	public void causeHearingVoices() {
		insanityCauser.causeHearingVoices();
	}
}
