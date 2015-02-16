/*	$Header: $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.jpaTraining.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *  Entity for code monkeys.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/02/25 10:22:00 $ by $Author: CROSTA $	
 */
@Entity
public class CodeMonkey implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "MonkeyID")
	private Integer id;

	private String name;

	private short wordsPerMinute;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public short getWordsPerMinute() {
		return wordsPerMinute;
	}


	public void setWordsPerMinute(short wordsPerMinute) {
		this.wordsPerMinute = wordsPerMinute;
	}
}
