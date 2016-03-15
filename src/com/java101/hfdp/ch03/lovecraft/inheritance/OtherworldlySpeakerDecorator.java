/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch03/elderOnes/strategy/ElderOneDecorator.java#2 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch03.lovecraft.inheritance;

import com.java101.hfdp.ch03.lovecraft.ElderOne;

/**
 *  Prototypical abstract decorator class.
 */
public abstract class OtherworldlySpeakerDecorator implements ElderOne {

	private final ElderOne delegate;


	protected OtherworldlySpeakerDecorator(ElderOne elderOne) {
		delegate = elderOne;
	}


	protected ElderOne getDelegate() {
		return delegate;
	}

    /**
     * Assert that decorators must implement this method.
     */
	@Override
	public abstract void speakFromBeyond();

	@Override
	public final String getName() {
		return delegate.getName();
	}

	@Override
	public final void setName(String name) {
		delegate.setName(name);
	}

	@Override
	public final String getNickname() {
		return delegate.getNickname();
	}

	@Override
	public final void setNickname(String nickname) {
		delegate.setNickname(nickname);
	}

	@Override
	public final String getAuthor() {
		return delegate.getAuthor();
	}

	@Override
	public final void setAuthor(String author) {
		delegate.setAuthor(author);
	}

	@Override
	public final String getDescription() {
		return delegate.getDescription();
	}

	@Override
	public final void setDescription(String description) {
		delegate.setDescription(description);
	}

}
