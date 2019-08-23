package pe.com.jdmm21.common.exception.condition;

import pe.com.jdmm21.common.exception.ApiRestBadRequestException;
import pe.com.jdmm21.common.exception.ApiRestResourceNotFoundException;
import pe.com.jdmm21.common.utilitario.Constantes;

public class RestPreCondition {

	private RestPreCondition() {
		throw new AssertionError();
	}

	public static void checkIfBadRequest(final boolean expression, final String message) {
		if (expression) {
			throw new ApiRestBadRequestException(message);
		}
	}
	
	public static void checkIfResourceExists(final boolean expression) {
		if(expression) {
			throw new ApiRestResourceNotFoundException(Constantes.RESOURCE_DOES_NOT_EXIST);
		}
	}

}
