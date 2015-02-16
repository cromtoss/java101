/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch05/singleton1/SimpleSingleton.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch05.singleton1;

import com.java101.hfdp.ch05.elders.ElderOne;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *  Represents the jail for captured elder ones.
 *
 *  Implements the singleton pattern -- discuss.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/14 11:45:26 $ by $Author: crosta $	
 */
public final class SimpleSingleton implements Serializable {

	// Singleton instance.
	private static final SimpleSingleton INSTANCE = new SimpleSingleton();

	// Object state: elders in jail.
	private List<ElderOne> capturedElders = new ArrayList<>();


	/**
	 * Private access: use {@linkplain this#getInstance()} to access the singleton.
	 */
	private SimpleSingleton() {}


	/**
	 * Singleton access method.
	 *
	 * @return
	 * 	the singleton
	 */
	public static SimpleSingleton getInstance() {
		return INSTANCE;
	}


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

// Why not simply make INSTANCE public?
// Does this class use eager or lazy instantiation?
// Does this class have a thread-safe instantiation implementation?
// Does this class have a thread-safe usage implementation?
// Should this class be final?
// Would the mechanism for storing captured elders work if ElderOnes are not themselves singletons?
// What are the implications of a Serializable singleton?
