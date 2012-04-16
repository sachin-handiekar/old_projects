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
package org.jcineworld.entity.performance;

import com.google.gson.annotations.SerializedName;

public class Performance {

	/**
	 * An instance field to denote the time (format hh:mm) at which the
	 * performance is scheduled to start.
	 */
	@SerializedName("time")
	private String performanceTime;

	/**
	 * An instance field to denote whether it is possible to book tickets for
	 * this performance.
	 */
	@SerializedName("available")
	private boolean available;

	/**
	 * An instance field to denote the Performance type code.
	 */
	@SerializedName("type")
	private String performanceType;

	/**
	 * An instance field to denote whether this performance is audio-described.
	 */
	@SerializedName("ad")
	private boolean audioDescribed;

	/**
	 * Whether this performance is subtitled
	 */
	@SerializedName("subtitled")
	private boolean subTitled;

	/**
	 * Absolute URL to the performance booking page.
	 */
	@SerializedName("booking_url")
	private String bookingUrl;

	public String getPerformanceTime() {
		return performanceTime;
	}

	public void setPerformanceTime(String performanceTime) {
		this.performanceTime = performanceTime;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getPerformanceType() {
		return performanceType;
	}

	public void setPerformanceType(String performanceType) {
		this.performanceType = performanceType;
	}

	public boolean isAudioDescribed() {
		return audioDescribed;
	}

	public void setAudioDescribed(boolean audioDescribed) {
		this.audioDescribed = audioDescribed;
	}

	public boolean isSubTitled() {
		return subTitled;
	}

	public void setSubTitled(boolean subTitled) {
		this.subTitled = subTitled;
	}

	public String getBookingUrl() {
		return bookingUrl;
	}

	public void setBookingUrl(String bookingUrl) {
		this.bookingUrl = bookingUrl;
	}

}
