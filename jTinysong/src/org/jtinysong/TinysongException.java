package org.jtinysong;

@SuppressWarnings("serial")
public class TinysongException extends Exception {
	/**
	 * Constructs a new exception with the specified message.
	 * 
	 * @param message
	 *            the reason for the exception
	 */
	public TinysongException(String message) {
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
	public TinysongException(String message, Throwable cause) {
		super(message, cause);
	}

}
