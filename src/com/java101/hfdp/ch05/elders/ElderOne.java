/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfdp/ch05/elders/ElderOne.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.ch05.elders;


import com.java101.hfdp.ch05.elders.characteristic.AllStarTeam;
import com.java101.hfdp.ch05.elders.characteristic.Elders;
import com.java101.hfdp.ch05.elders.characteristic.Position;

import java.io.Serializable;

/**
 *  Elder One base class.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/04/14 11:45:26 $ by $Author: crosta $	
 */
public abstract class ElderOne implements Serializable {

	protected Elders elderType;

	private String name;
	private String nickname;
	private String author;
	private String description;

	private AllStarTeam allStarTeam;
	private Position position;

	private boolean investigated; // indicates if this elder one has been investigated


	protected ElderOne(Elders elderType) {
		this.elderType = elderType;
	}


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


	public Elders getElderType() {
		return elderType;
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


	public void setElderType(Elders elderType) {
		this.elderType = elderType;
	}


	public boolean isInvestigated() {
		return investigated;
	}


	public void setInvestigated(boolean investigated) {
		this.investigated = investigated;
	}


	public AllStarTeam getAllStarTeam() {
		return allStarTeam;
	}


	public void setAllStarTeam(AllStarTeam allStarTeam) {
		this.allStarTeam = allStarTeam;
	}


	public Position getPosition() {
		return position;
	}


	public void setPosition(Position position) {
		this.position = position;
	}


	@Override
	public String toString() {
		return "Name: " + getName() + "\nTeam: " + getAllStarTeam() + "\nPosition: " + getPosition();
	}
}
