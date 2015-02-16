/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch01/elderOnes/strategy/InsanityCauserImpl.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch01.elderOnes.strategy;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public final class InsanityCauserImpl implements InsanityCauser {

	@Override
	public void causeNightmares() {
		System.out.println("I am causing fitful nightmares!");
	}


	@Override
	public void causeWakingVisions() {
		System.out.println("I am causing you to see strange things!");
	}


	@Override
	public void causeHearingVoices() {
		System.out.println("I am whispering creepily from the cosmic void!");
	}
}
