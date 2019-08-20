package pe.com.jdmm21.exception;

public class ApiRestBadRequestExceptionException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ApiRestBadRequestExceptionException() {
		super();
	}

	public ApiRestBadRequestExceptionException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ApiRestBadRequestExceptionException(String message, Throwable cause) {
		super(message, cause);
	}

	public ApiRestBadRequestExceptionException(String message) {
		super(message);
	}

	public ApiRestBadRequestExceptionException(Throwable cause) {
		super(cause);
	}

}
