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
package org.jcineworld;

import java.util.List;

import org.jcineworld.config.Constants;
import org.jcineworld.entity.cinema.Cinema;
import org.jcineworld.entity.cinema.CinemaMessage;
import org.jcineworld.entity.film.Film;
import org.jcineworld.entity.film.FilmMessage;
import org.jcineworld.entity.performance.Performance;
import org.jcineworld.entity.performance.PerformancesMessage;
import org.jcineworld.http.CineworldHttpRequest;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;

/**
 * Main class which can be used to retrive film and cinema listing from the
 * CineWorld API.
 * 
 * @author Sachin Handiekar
 * @version 1.0
 */
public class Cineworld {

	/**
	 * Developer API key.
	 */
	private final String apiKey;

	/**
	 * A parameter c-tor which accepts apiKey.
	 * 
	 * @param apiKey
	 *            a valid Cineworld api key.
	 */
	public Cineworld(String apiKey) {
		this.apiKey = apiKey;
	}

	/**
	 * 
	 * @return
	 * @throws CineworldException
	 */
	public List<Cinema> getCinemas() throws CineworldException {

		CinemaMessage message = null;
		String params = Constants.CINEMAS + "?key=" + apiKey + "&"
				+ Constants.FULL_DETAILS;

		message = getCinemaResponse(params);

		return message.getCinemas();

	}

	/**
	 * 
	 * @return
	 * @throws CineworldException
	 */
	public List<Film> getFilms() throws CineworldException {
		FilmMessage message = null;

		String params = Constants.FILMS + "?key=" + apiKey + "&"
				+ Constants.FULL_DETAILS;

		message = this.getFilmResponse(params);

		return message.getFilms();
	}

	public List<Performance> getPerformances(int cinemaID, int filmID,
			String date) throws CineworldException {

		PerformancesMessage message = null;

		String params = Constants.PERFORMANCES + "?key=" + apiKey + "&cinema="
				+ cinemaID + "&film=" + filmID + "&date=" + date;

		String response = CineworldHttpRequest.sendRequest(params);

		Gson gson = new Gson();
		try {
			message = gson.fromJson(response, PerformancesMessage.class);
		} catch (JsonParseException ex) {
			errorHandler(response);
		}
		return message.getPerformances();

	}

	/**
	 * Returns a de-serialzied message response of type CinemaMessage.
	 * 
	 * @param params
	 *            a string which contains the key-value pair.
	 * @return a CinemaMessage entity.
	 * @throws CineworldException
	 *             if any error occurs.
	 */
	private CinemaMessage getCinemaResponse(String params)
			throws CineworldException {
		CinemaMessage message = null;

		String response = CineworldHttpRequest.sendRequest(params);

		Gson gson = new Gson();
		try {
			message = gson.fromJson(response, CinemaMessage.class);
		} catch (JsonParseException ex) {
			errorHandler(response);
		}

		return message;
	}

	private void errorHandler(String response) throws CineworldException {

	}

	/**
	 * Returns a de-serialzied message response of type FilmMessage.
	 * 
	 * @param params
	 *            parameters to pass
	 * @return
	 * @throws CineworldException
	 */
	private FilmMessage getFilmResponse(String params)
			throws CineworldException {
		FilmMessage message = null;

		String response = CineworldHttpRequest.sendRequest(params);

		Gson gson = new Gson();

		message = gson.fromJson(response, FilmMessage.class);

		return message;

	}
}
