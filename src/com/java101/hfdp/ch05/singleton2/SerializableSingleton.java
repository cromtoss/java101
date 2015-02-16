/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch05/singleton2/SerializableSingleton.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch05.singleton2;

import com.java101.hfdp.ch05.elders.ElderOne;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *	Singleton pattern: object representing a jail for elder ones.
 *  Serializable singleton reference implementation.
 *
 *  Note: the access of the internal collection of captured elders is not thread-safe.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/14 11:45:26 $ by $Author: crosta $	
 */
public final class SerializableSingleton implements Serializable {

	// Singleton instance.
	private static SerializableSingleton INSTANCE = new SerializableSingleton();

	// Object state: elders in jail.
	private transient List<ElderOne> capturedElders = new ArrayList<>();


	/**
	 * Private access: use {@linkplain this#getInstance()} to access the singleton.
	 */
	private SerializableSingleton() {}


	/**
	 * Singleton access method.
	 *
	 * @return
	 * 	the singleton
	 */
	public static SerializableSingleton getInstance() {
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


	/**
	 * It's not very Java-like, but this method is called "by magic" by the Java
	 * Serialization mechanisms. Unlike other things in Java, this isn't driven
	 * by an explicit contract defined in java.io.Serializable.
	 */
	private Object readResolve() throws ObjectStreamException {
		return INSTANCE;
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
