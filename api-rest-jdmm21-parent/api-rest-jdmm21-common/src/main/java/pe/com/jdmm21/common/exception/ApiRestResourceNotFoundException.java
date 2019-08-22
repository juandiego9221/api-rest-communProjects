package pe.com.jdmm21.common.exception;

public class ApiRestResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ApiRestResourceNotFoundException() {
		super();
	}

	public ApiRestResourceNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ApiRestResourceNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ApiRestResourceNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ApiRestResourceNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}
