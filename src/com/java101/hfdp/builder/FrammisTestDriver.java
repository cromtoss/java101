/*	$Header: $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.builder;

import com.java101.hfdp.builder.Frammis.FrammisBuilder;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/06/06 15:16:00 $ by $Author: CROSTA $	
 */
public class FrammisTestDriver {

	public static void main(String[] args) {
		FrammisBuilder builder = new FrammisBuilder();

		builder.setAlpha("alpha");

		builder.build();
	}
}
