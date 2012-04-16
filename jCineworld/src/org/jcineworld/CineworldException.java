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

@SuppressWarnings("serial")
public class CineworldException extends Exception {
	/**
	 * Constructs a new exception with the specified message.
	 * 
	 * @param message
	 *            the reason for the exception
	 */
	public CineworldException(String message) {
		super(message);
	}

	/**
	 * Constructs a new exception with the specified message and wrapped
	 * exception.
	 * 
	 * @param message
	 *            the reason for the exception
	 * @param cause
	 *            the internal exception that caused this exception
	 */
	public CineworldException(String message, Throwable cause) {
		super(message, cause);
	}

}
