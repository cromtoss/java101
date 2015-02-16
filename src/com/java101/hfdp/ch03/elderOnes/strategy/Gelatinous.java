/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch03/elderOnes/strategy/Gelatinous.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch03.elderOnes.strategy;

import com.java101.hfdp.ch03.elderOnes.ElderOne;

/**
 *  An intentionally wrong example of a decorator that tries to directly
 *  use the base class without re-implementing all of the methods.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/13 21:53:19 $ by $Author: crosta $	
 */
public final class Gelatinous extends ElderOne {

	private final ElderOne elderOne;


	public Gelatinous(ElderOne elderOne) {
		this.elderOne = elderOne;
	}


	@Override
	public void wreakHavoc() {
		elderOne.wreakHavoc();
		System.out.println("Gelatinous goo jibbers");
	}
}
