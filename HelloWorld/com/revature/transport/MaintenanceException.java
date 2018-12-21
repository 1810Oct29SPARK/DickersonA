package com.revature.transport;

public class MaintenanceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MaintenanceException() {

	}

	public MaintenanceException(String message) {
		super(message);
	
	}

	public MaintenanceException(Throwable cause) {
		super(cause);

	}

	public MaintenanceException(String message, Throwable cause) {
		super(message, cause);
	
	}

	public MaintenanceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	
	}

}
