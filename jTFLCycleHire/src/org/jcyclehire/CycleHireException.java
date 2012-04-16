package org.jcyclehire;

import org.jcyclehire.entity.Station;
import org.jcyclehire.entity.Stations;

import java.util.Date;
import java.util.List;

public class CycleHireException extends Exception {
	/**
	 * Constructs a new exception with the specified message.
	 * 
	 * @param message
	 *            the reason for the exception
	 */
	public CycleHireException(String message) {
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
	public CycleHireException(String message, Throwable cause) {
		super(message, cause);
	}

}
