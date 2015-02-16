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
import javax.persistence.Table;

/**
 *  Entity for company cars (by definition they are sweet).
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/02/25 10:19:00 $ by $Author: CROSTA $	
 */

@Entity
@Table(name = "SweetCompanyCar")
public class CompanyCar implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "CarID")
	private Integer id;

	@Column(name = "VIN", nullable = false)
	private String vehicleIdentifier;

	@Column(nullable = false)
	private String model;

	@Column(nullable = false)
	private short year;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getVehicleIdentifier() {
		return vehicleIdentifier;
	}


	public void setVehicleIdentifier(String vehicleIdentifier) {
		this.vehicleIdentifier = vehicleIdentifier;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public short getYear() {
		return year;
	}


	public void setYear(short year) {
		this.year = year;
	}
}
