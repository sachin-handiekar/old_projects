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
package org.jcineworld.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.jcineworld.CineworldException;
import org.jcineworld.config.Constants;

public class CineworldHttpRequest {

	public static String sendRequest(String requestString)
			throws CineworldException {
		StringBuffer buffer = new StringBuffer();

		try {

			String apiUrl = Constants.API_URL + requestString;

			
			System.out.println(apiUrl);
			URL url = new URL(apiUrl);

			BufferedReader in = new BufferedReader(new InputStreamReader(
					url.openStream()));
			String str;

			while ((str = in.readLine()) != null) {
				buffer.append(str);
			}

			in.close();
		} catch (MalformedURLException e) {
			throw new CineworldException(e.getMessage());
		} catch (IOException e) {
			throw new CineworldException(e.getMessage());
		}

		return buffer.toString();
	}
}
