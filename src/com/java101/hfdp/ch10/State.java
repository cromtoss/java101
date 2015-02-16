/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch10/State.java#2 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch10;

/**
 *  State Pattern interface: represents all actions that can affect state.
 *
 *  @author Tom Cross
 *  @version $Revision: #2 $ submitted $DateTime: 2014/05/09 15:06:08 $ by $Author: crosta $	
 */
interface State {

	void insertQuarter();

	void ejectQuarter();

	void turnCrank();

	void dispense();
}

