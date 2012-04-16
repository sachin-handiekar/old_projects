package org.jtinysong;

import com.google.gson.Gson;

import org.jtinysong.config.Constants;
import org.jtinysong.entity.ErrorEntity;
import org.jtinysong.entity.Song;
import org.jtinysong.http.TinysongHttpRequest;

import java.io.UnsupportedEncodingException;

import java.net.URLEncoder;

public class Tinysong {

	/** A field to denote the apiKey for the Tinysong API. */
	private final String apiKey;

	public Tinysong(String apiKey) {
		this.apiKey = apiKey;
	}

	/**
	 * Search for songs which match the criteria given in the search query.
	 * 
	 * @param query
	 *            criteria to search for songs
	 * @param limit
	 *            number of songs to be return from the api. ( Should be between
	 *            1 and 38 )
	 * @return a list of songs.
	 * @throws TinysongException
	 *             if any error occurs
	 */
	public Song[] getSongs(String query, int limit) throws TinysongException {
		StringBuilder builder = new StringBuilder();

		builder.append(Constants.BASE_URL);

		// API Method
		builder.append(Constants.METHOD_S);

		try {
			builder.append(URLEncoder.encode(query, Constants.UTF_8_ENCODING));
		} catch (UnsupportedEncodingException e) {
			throw new TinysongException("Unsupported Encoding!!", e);
		}

		builder.append("?" + "limit=" + limit + "&" + Constants.FORMAT + "&"
				+ "key=" + apiKey);

		Song[] songs = null;
		Gson gson = new Gson();
		String response = TinysongHttpRequest.sendRequest(builder.toString());

		try {
			songs = gson.fromJson(response, Song[].class);
		} catch (Exception e) {
			handleErrorResponse(response);
		}

		return songs;
	}

	/**
	 * This methods performs the search, returns a Song object
	 * 
	 * @param query
	 *            search query
	 * @return the song
	 * @throws TinysongException
	 *             if any error occurs.
	 */
	public Song getSong(String query) throws TinysongException {
		StringBuilder builder = new StringBuilder();

		builder.append(Constants.BASE_URL);

		// API Method
		builder.append(Constants.METHOD_B);

		try {
			builder.append(URLEncoder.encode(query, Constants.UTF_8_ENCODING));
		} catch (UnsupportedEncodingException e) {
			throw new TinysongException("Unsupported Encoding!!", e);
		}

		builder.append("?" + "key=" + apiKey + "&" + Constants.FORMAT);

		Song song = null;
		Gson gson = new Gson();
		String response = TinysongHttpRequest.sendRequest(builder.toString());

		try {
			song = gson.fromJson(response, Song.class);
		} catch (Exception e) {
			handleErrorResponse(response);
		}

		return song;
	}

	/**
	 * Handles the error message sent from the Tinysong API.
	 * 
	 * @param response
	 *            json response from the api.
	 * @throws TinysongException
	 *             if any error occurs.
	 */
	private void handleErrorResponse(String response) throws TinysongException {
		ErrorEntity error = null;
		Gson gson = new Gson();

		error = gson.fromJson(response, ErrorEntity.class);

		throw new TinysongException(error.getError());
	}
}
