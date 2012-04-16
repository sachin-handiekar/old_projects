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
package org.jcineworld.config;

public class Constants {
	/**
	 * A constant field to denote the base API url.
	 */
	public static final String API_URL = "http://www.cineworld.com/api/quickbook/";

	/**
	 * A constant field to denote the base API url.
	 */
	public static final String CINEMAS = "cinemas";

	/**
	 * A constant field to denote the base API url.
	 */
	public static final String FILMS = "films";

	/**
	 * The field will retrieve all the additional fields for each cinema,
	 * namely; address, postcode and telephone.
	 */
	public static final String FULL_DETAILS = "full=true";

	
	public static final String PERFORMANCES = "performances";
	
	/**
	 * A constant field to denote the value of FORMAT in the KV mapping.
	 */
	public static final String FORMAT = "format";

	/**
	 * A constant field to denote the value of JSON in the KV mapping.
	 */
	public static final String JSON = "json";

	/**
	 * A constant field to denote the value of '/' .
	 */
	public static final String URL_DELIM = "/";
}
