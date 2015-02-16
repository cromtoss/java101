/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch03/elderOnes/ElderOne.java#3 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch03.elderOnes;

/**
 *  Elder One base class.
 *
 *  @author Tom Cross
 *  @version $Revision: #3 $ submitted $DateTime: 2014/03/27 10:22:39 $ by $Author: crosta $	
 */
public abstract class ElderOne implements HavocWreaker {

	private String name;
	private String nickname;
	private String author;
	private String description;


	// Implicit from the HavocWreaker contract.
	@Override
	public abstract void wreakHavoc();


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

}
