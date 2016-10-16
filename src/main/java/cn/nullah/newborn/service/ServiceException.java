package cn.nullah.newborn.service;

public class ServiceException extends RuntimeException {
	private static final long serialVersionUID = -394366683762881285L;

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Throwable e) {
		super(e);
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}
}
