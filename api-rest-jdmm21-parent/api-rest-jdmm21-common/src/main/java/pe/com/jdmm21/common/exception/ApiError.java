package pe.com.jdmm21.common.exception;

public class ApiError {

	private int status;
	private String message;
	private String developerMessage;

	public ApiError(int status, String message, String developerMessage) {
		super();
		this.status = status;
		this.message = message;
		this.developerMessage = developerMessage;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}

	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}

}
