/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch05/singleton2/SerializableSingletonExample.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch05.singleton2;


import com.java101.hfdp.ch05.elders.Cthulhu;
import com.java101.hfdp.ch05.elders.Hastur;
import com.java101.hfdp.ch05.elders.Ithaqua;
import com.java101.hfdp.ch05.elders.Tsathoggua;
import com.java101.hfdp.ch05.elders.Yig;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *  Example driver for Singleton1.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/14 11:45:26 $ by $Author: crosta $	
 */
public final class SerializableSingletonExample {

	private static final Cthulhu CTHULHU;
	private static final Hastur HASTUR;
	private static final Ithaqua ITHAQUA;
	private static final Tsathoggua TSATHOGGUA;
	private static final Yig YIG;


	static {
		CTHULHU = new Cthulhu(
			"Cthulhu",
			"The Caller",
			"H. P. Lovecraft",
			"A mix between a giant human, an octopus, and a dragon, and is depicted as being hundreds of meters tall, with human-looking arms and legs and a pair of rudimentary wings on its back."
		);

		HASTUR = new Hastur(
			"Hastur",
			"The King in Yellow",
			"Ambrose Bierce",
			"Its true form is unknown, but usually manifests either as a polypous, ravenous floating mass endowed with tentacles, drills and suckers or, more frequently, as the King in Yellow, a humanoid being wearing tattered, yellow clothes and a mask hiding the face. It is said to be Cthulhu's (half-)brother."
		);

		ITHAQUA = new Ithaqua(
			"Ithaqua",
			"The Caller",
			"Algernon Blackwood",
			"A gigantic, corpse-like human with webbed feet and glowing red eyes."
		);

		TSATHOGGUA = new Tsathoggua(
			"Tsathoggua",
			"The Sleeper of N'kai",
			"Clark Ashton Smith",
			"Appears as a huge, furry, almost humanoid toad, or a bat-like sloth."
		);

		YIG = new Yig(
			"Yig",
			"Father of Serpents",
			"Zealia Bishop",
			"A giant snake with human arms covered in scales. Son of the Mappo's Dragon, children of his are Ayi'ig and Voltiyig, whereas Rokon is regarded as the brother of Yig."
		);
	}


	public static void main(String[] args) throws IOException, ClassNotFoundException {
		final File file = new File("C:/temp/singleton.ser");

		final SerializableSingleton singleton = SerializableSingleton.getInstance();

		singleton.addCapturedElder(CTHULHU);
		singleton.addCapturedElder(HASTUR);

		final FileOutputStream fileStream = new FileOutputStream(file);
		final ObjectOutputStream oos = new ObjectOutputStream(fileStream);
		oos.writeObject(singleton);
		oos.close();

		final FileInputStream fileInputStream = new FileInputStream(file);
		final ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		final SerializableSingleton deserializedRef = (SerializableSingleton) inputStream.readObject();

		// Yig has been captured!
		singleton.addCapturedElder(YIG);

		System.out.println("Singleton contents: " + singleton.toString());
		System.out.println("Deserialized Singleton contents: " + deserializedRef.toString());
	}

}
