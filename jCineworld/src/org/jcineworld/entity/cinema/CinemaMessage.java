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

import java.util.List;
 
import com.google.gson.annotations.SerializedName;

public class CinemaMessage {
	 

	@SerializedName("cinemas")
	private List<Cinema> cinemas;

	public void setCinemas(List<Cinema> cinemas) {
		this.cinemas = cinemas;
	}

	public List<Cinema> getCinemas() {
		return cinemas;
	}
 
}
