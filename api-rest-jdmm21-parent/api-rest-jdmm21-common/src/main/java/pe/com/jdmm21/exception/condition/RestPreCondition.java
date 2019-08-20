package pe.com.jdmm21.exception.condition;

import pe.com.jdmm21.exception.ApiRestBadRequestExceptionException;

public class RestPreCondition {
	
	private RestPreCondition() {
		throw new AssertionError();
	}
	
    public static void checkIfBadRequest(final boolean expression, final String message) {
        if (expression) {
            throw new ApiRestBadRequestExceptionException(message);
        }
    }
	

	
}
