package pe.com.jdmm21.common.exception;

public class ApiRestResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ApiRestResourceNotFoundException() {
		super();
	}

	public ApiRestResourceNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ApiRestResourceNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ApiRestResourceNotFoundException(String message) {
		super(message);
	}

	public ApiRestResourceNotFoundException(Throwable cause) {
		super(cause);
	}
	

}
