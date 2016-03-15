/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch03/elderOnes/strategy/EclipseTriggerer.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch03.lovecraft.composition;


import com.java101.hfdp.ch03.lovecraft.ElderOne;

/**
 *  A decorator that triggers a lunar eclipse.
 */
public final class EclipseDecorator implements ElderOne {

	private final ElderOne elderOne;


	public EclipseDecorator(ElderOne elderOne) {
		this.elderOne = elderOne;
	}


	@Override
	public String getName() {
		return elderOne.getName();
	}

	@Override
	public void setName(String name) {
		elderOne.setName(name);
	}

	@Override
	public String getNickname() {
		return elderOne.getNickname();
	}

	@Override
	public void setNickname(String nickname) {
		elderOne.setNickname(nickname);
	}

	@Override
	public String getAuthor() {
		return elderOne.getAuthor();
	}

	@Override
	public void setAuthor(String author) {
		elderOne.setAuthor(author);
	}

	@Override
	public String getDescription() {
		return elderOne.getDescription();
	}

	@Override
	public void setDescription(String description) {
		elderOne.setDescription(description);
	}

	@Override
	public void speakFromBeyond() {
		elderOne.speakFromBeyond();
		System.out.println("Eclipse; it darkens");
	}
}
