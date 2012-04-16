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
package org.jcineworld.entity.film;

import com.google.gson.annotations.SerializedName;

/**
 * A class to denote the Film entity.
 * 
 * @author Sachin Handiekar
 * @version 1.0
 */
public class Film {

	/**
	 * EDI number
	 */
	@SerializedName("edi")
	private int filmEDI;

	/**
	 * Film title
	 */
	@SerializedName("title")
	private String filmTitle;

	/**
	 * Cineworld film id
	 */
	@SerializedName("id")
	private int cineworldID;

	/**
	 * Film classification
	 */
	@SerializedName("classification")
	private String classification;

	@SerializedName("advisory")
	private String advisory;

	@SerializedName("poster_url")
	private String filmPosterUrl;

	@SerializedName("still_url")
	private String filmStillUrl;

	@SerializedName("film_url")
	private String filmUrl;

	public int getFilmEDI() {
		return filmEDI;
	}

	public void setFilmEDI(int filmEDI) {
		this.filmEDI = filmEDI;
	}

	public String getFilmTitle() {
		return filmTitle;
	}

	public void setFilmTitle(String filmTitle) {
		this.filmTitle = filmTitle;
	}

	public int getCineworldID() {
		return cineworldID;
	}

	public void setCineworldID(int cineworldID) {
		this.cineworldID = cineworldID;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getAdvisory() {
		return advisory;
	}

	public void setAdvisory(String advisory) {
		this.advisory = advisory;
	}

	public String getFilmPosterUrl() {
		return filmPosterUrl;
	}

	public void setFilmPosterUrl(String filmPosterUrl) {
		this.filmPosterUrl = filmPosterUrl;
	}

	public String getFilmStillUrl() {
		return filmStillUrl;
	}

	public void setFilmStillUrl(String filmStillUrl) {
		this.filmStillUrl = filmStillUrl;
	}

	public String getFilmUrl() {
		return filmUrl;
	}

	public void setFilmUrl(String filmUrl) {
		this.filmUrl = filmUrl;
	}

}
