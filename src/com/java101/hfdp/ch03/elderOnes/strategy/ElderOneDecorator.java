/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch03/elderOnes/strategy/ElderOneDecorator.java#2 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch03.elderOnes.strategy;

import com.java101.hfdp.ch03.elderOnes.ElderOne;

/**
 *  Prototypical abstract decorator class.
 *
 *  @author Tom Cross
 *  @version $Revision: #2 $ submitted $DateTime: 2014/03/14 16:10:35 $ by $Author: crosta $	
 */
public abstract class ElderOneDecorator extends ElderOne {

	private final ElderOne delegate;


	protected ElderOneDecorator(ElderOne elderOne) {
		delegate = elderOne;
	}


	protected ElderOne getDelegate() {
		return delegate;
	}


	@Override
	public abstract void wreakHavoc();


	@Override
	public String getName() {
		return delegate.getName();
	}


	@Override
	public void setName(String name) {
		delegate.setName(name);
	}


	@Override
	public String getNickname() {
		return delegate.getNickname();
	}


	@Override
	public void setNickname(String nickname) {
		delegate.setNickname(nickname);
	}


	@Override
	public String getAuthor() {
		return delegate.getAuthor();
	}


	@Override
	public void setAuthor(String author) {
		delegate.setAuthor(author);
	}


	@Override
	public String getDescription() {
		return delegate.getDescription();
	}


	@Override
	public void setDescription(String description) {
		delegate.setDescription(description);
	}

}
