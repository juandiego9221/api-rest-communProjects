package pe.com.jdmm21.common.exception;

public class ApiRestBadRequestException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ApiRestBadRequestException() {
		super();
	}

	public ApiRestBadRequestException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ApiRestBadRequestException(String message, Throwable cause) {
		super(message, cause);
	}

	public ApiRestBadRequestException(String message) {
		super(message);
	}

	public ApiRestBadRequestException(Throwable cause) {
		super(cause);
	}

}
