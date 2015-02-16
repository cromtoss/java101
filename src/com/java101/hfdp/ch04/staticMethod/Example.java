/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch04/staticMethod/Example.java#2 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch04.staticMethod;

import com.java101.hfdp.ch04.elders.ElderOne;
import com.java101.hfdp.ch04.elders.characteristic.Elders;

/**
 *  Example showing the static factory method.
 *
 *  @author Tom Cross
 *  @version $Revision: #2 $ submitted $DateTime: 2014/03/27 10:22:39 $ by $Author: crosta $	
 */
public final class Example {

	public static void main(String[] args) {
		final ElderOne cthulhu = ElderOneStaticFactory.create(Elders.CTHULHU);

		System.out.println("Hi, I'm " + cthulhu.getName() + ", but call me " + cthulhu.getNickname() + ".");
	}

}
