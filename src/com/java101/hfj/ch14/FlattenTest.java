/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/ch14/FlattenTest.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.ch14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public final class FlattenTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FlatMan david = new FlatMan("Dave", 40);
		FlatMan michael = new FlatMan("Michael", 38);
		FlatMan karl = new FlatMan("Karl", 33);

		System.out.println("Dave's information: " + david.toString());
		System.out.println("The counter is: " + FlatMan.getStaticCounter());
		System.out.println();

		FileOutputStream fileOutputStream = new FileOutputStream("flatDave.zzz");
		ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
		os.writeObject(david);
		os.close();

		FileInputStream fis = new FileInputStream("flatDave.zzz");
		ObjectInputStream is = new ObjectInputStream(fis);
		david = (FlatMan) is.readObject();

		System.out.println("Inflated Dave's information: " + david.toString());
		System.out.println("The counter is: " + FlatMan.getStaticCounter());

	}
}
