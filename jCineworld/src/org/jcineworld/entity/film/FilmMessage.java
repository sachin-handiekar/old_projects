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

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * A class to denote the Film Message container
 * 
 * @author Sachin Handiekar
 * @version 1.0
 */
public class FilmMessage {

	@SerializedName("films")
	private List<Film> films;

	public void setFilms(List<Film> films) {
		this.films = films;
	}

	public List<Film> getFilms() {
		return films;
	}
}
