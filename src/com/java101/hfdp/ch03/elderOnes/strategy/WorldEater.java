/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch03/elderOnes/strategy/WorldEater.java#2 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch03.elderOnes.strategy;

import com.java101.hfdp.ch03.elderOnes.ElderOne;

/**
 *  Typical concrete decorator.
 *
 *  @author Tom Cross
 *  @version $Revision: #2 $ submitted $DateTime: 2014/03/14 16:10:35 $ by $Author: crosta $	
 */
public final class WorldEater extends ElderOneDecorator {

	public WorldEater(ElderOne elderOne) {
		super(elderOne);
	}


	@Override
	public void wreakHavoc() {
		getDelegate().wreakHavoc();
		System.out.println("The world is so tasty");
	}
}
