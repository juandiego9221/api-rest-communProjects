package pe.com.jdmm21.common.exception.condition;

import pe.com.jdmm21.common.exception.ApiRestBadRequestException;
import pe.com.jdmm21.common.exception.ApiRestResourceNotFoundException;

public class RestPreCondition {

	private RestPreCondition() {
		throw new AssertionError();
	}

	public static void checkIfBadRequest(final boolean expression, final String message) {
		if (expression) {
			throw new ApiRestBadRequestException(message);
		}
	}
	
	public static void checkIfResourceExists(final boolean expression,final String message) {
		if(expression) {
			throw new ApiRestResourceNotFoundException(message);
		}
	}

}
