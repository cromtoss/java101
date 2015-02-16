/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/ch14/FileTest.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.ch14;

import java.io.File;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public final class FileTest {

	// java.io.File -- YOU SHOULD REALLY BE THINKING "PATH", not "FILE"
	public static void main(String[] args) {
		File tom1 = new File("~/.dropbox");
		System.out.println("File 1: " + tom1.getAbsolutePath());
		System.out.println("Exists: " + tom1.exists());
		System.out.println("Is Directory: " + tom1.isDirectory());

		System.out.println();

		File tom2 = new File("~/data");
		System.out.println("File 2: " + tom2.getAbsolutePath());
		System.out.println("Exists: " + tom2.exists());
		System.out.println("Is Directory: " + tom2.isDirectory());

		System.out.println();

		File tom3 = new File("~/snorgleborgle");
		System.out.println("File 3: " + tom3.getAbsolutePath());
		System.out.println("Exists: " + tom3.exists());
		System.out.println("Is Directory: " + tom3.isDirectory());
	}

}
