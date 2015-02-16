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
 *  Entity for bonus plans.
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/02/25 10:16:00 $ by $Author: CROSTA $	
 */

@Entity
public class BonusPlan implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "BonusPlanID")
	private Integer id;

	private String name;

	@Column(name = "NumPayments", nullable = false)
	private byte numberOfPayments;

	@Column(nullable = false)
	private int paymentAmount;


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


	public byte getNumberOfPayments() {
		return numberOfPayments;
	}


	public void setNumberOfPayments(byte numberOfPayments) {
		this.numberOfPayments = numberOfPayments;
	}


	public int getPaymentAmount() {
		return paymentAmount;
	}


	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
}
