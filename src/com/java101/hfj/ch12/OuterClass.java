/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/ch12/OuterClass.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.ch12;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public final class OuterClass {

	private int x;

	private class InnerClass implements Observer {
		int addToX(int y) {
			return y + x;
		}

		@Override
		public void onSomethingHappened(String description) {
			//To change body of implemented methods use File | Settings | File Templates.
		}
	}

	private class AnotherInner implements Observer {
		@Override
		public void onSomethingHappened(String description) {
			//To change body of implemented methods use File | Settings | File Templates.
		}
	}

}

