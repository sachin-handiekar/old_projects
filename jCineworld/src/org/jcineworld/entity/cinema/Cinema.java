/*******************************************************************************
 * Copyright (c) 2011 Sachin Handiekar.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Sachin Handiekar - initial API and implementation
 ******************************************************************************/
package org.jcineworld.entity.cinema;

import com.google.gson.annotations.SerializedName;

public class Cinema {

	@SerializedName("id")
	private int id;

	@SerializedName("name")
	private String cinemaName;

	@SerializedName("cinema_url")
	private String cinemaUrl;

	@SerializedName("address")
	private String cinemaAddress;

	@SerializedName("postcode")
	private String cinemaPostcode;

	@SerializedName("telephone")
	private String cinemaPhone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCinemaName() {
		return cinemaName;
	}

	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}

	public String getCinemaUrl() {
		return cinemaUrl;
	}

	public void setCinemaUrl(String cinemaUrl) {
		this.cinemaUrl = cinemaUrl;
	}

	public String getCinemaAddress() {
		return cinemaAddress;
	}

	public void setCinemaAddress(String cinemaAddress) {
		this.cinemaAddress = cinemaAddress;
	}

	public String getCinemaPostcode() {
		return cinemaPostcode;
	}

	public void setCinemaPostcode(String cinemaPostcode) {
		this.cinemaPostcode = cinemaPostcode;
	}

	public String getCinemaPhone() {
		return cinemaPhone;
	}

	public void setCinemaPhone(String cinemaPhone) {
		this.cinemaPhone = cinemaPhone;
	}

}
