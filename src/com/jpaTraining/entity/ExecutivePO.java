/*	$Header: $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.jpaTraining.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *  Entity for executives.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/02/25 10:09:00 $ by $Author: CROSTA $	
 */

@Entity
public class ExecutivePO implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "ExecutiveID")
   	private Integer id;

	@Column(nullable = false)
	private String name;

	private String title;

	//tcTODO code for JPA associations (aka relationships):

	private BonusPlan bonusPlan;

	@OneToMany
	@JoinColumn(name = "BossID", referencedColumnName = "ExecutiveID")
	private Set<CodeMonkey> underlings;

	private CompanyCar companyCar;

	// Getters and setters:

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


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public BonusPlan getBonusPlan() {
		return bonusPlan;
	}


	public void setBonusPlan(BonusPlan bonusPlan) {
		this.bonusPlan = bonusPlan;
	}


	public Set<CodeMonkey> getUnderlings() {
		return underlings;
	}


	public void setUnderlings(Set<CodeMonkey> underlings) {
		this.underlings = underlings;
	}


	public CompanyCar getCompanyCar() {
		return companyCar;
	}


	public void setCompanyCar(CompanyCar companyCar) {
		this.companyCar = companyCar;
	}
}
