/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch05/singleton3/SpringSingleton.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch05.singleton3;

import com.java101.hfdp.ch05.elders.ElderOne;

import java.util.ArrayList;
import java.util.List;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/14 11:45:26 $ by $Author: crosta $	
 */
public final class SpringSingleton {

	// Object state: elders in jail.
	private List<ElderOne> capturedElders = new ArrayList<>();


	/**
	 * Non-public constructor.
	 */
	private SpringSingleton() {}



	public List<ElderOne> getCapturedElders() {
		return new ArrayList<>(capturedElders);
	}


	public void addCapturedElder(ElderOne elder) {
		if (!capturedElders.contains(elder)) {
			capturedElders.add(elder);
		}
	}


	public void releaseCapturedElder(ElderOne elder) {
		capturedElders.remove(elder);
	}


	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Captured: ");

		if (capturedElders.isEmpty()) {
			sb.append("None!");
		}

		for (ElderOne elderOne : capturedElders) {
			sb.append(elderOne.getName()).append(" ");
		}

		return sb.toString();
	}
}
