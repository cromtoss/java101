/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/ch11/FinallyWithReturn.java#1 $
 *
 *	Copyright � 2013 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.ch11;

/**
 *  Example for Chapter 11, Page 327.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public final class FinallyWithReturn {

	// There were no dependencies on object state for this example, so I made
	// all the methods static.

	public static int causeNoProblem() throws FinallyWithReturnException {
		//return 8; // Note no exception actually thrown.
		throw new FinallyWithReturnException();
	}

	public static int getNumber(int provided) {
		try {
			int sum = provided + causeNoProblem();
			return sum;
		} catch (FinallyWithReturnException ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("The finally ran!");
		}

		return provided; // Would indicate something bad happened.
	}

	// What happens when main is executed?
	public static void main(String[] args) {
		int arbitrary = 10;

		FinallyWithReturn fwr = new FinallyWithReturn();
		System.out.println("We got the number: " + fwr.getNumber(arbitrary));
	}

}
