package com.hecg.springboothelloworld.exception;

/**
 * 功能：自定义异常类，继承RuntimeException
 *
 * @author hecg
 * @version 2018年12月26日 下午2:50:44
 */
public class ApplicationException extends RuntimeException {

	private static final long serialVersionUID = -5982520368044963914L;

	public ApplicationException() {
		super();
	}

	public ApplicationException(String message) {
		super(message);
	}

	public ApplicationException(Throwable cause) {
		super(cause);
	}

	public ApplicationException(String message, Throwable cause) {
		super(message, cause);
	}

	public ApplicationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
