package pe.com.jdmm21.common.exception.condition;

import pe.com.jdmm21.common.exception.ApiRestBadRequestException;
import pe.com.jdmm21.common.utilitario.Utilitario;

public class RestPreCondition {

	private RestPreCondition() {
		throw new AssertionError();
	}

	public static void checkIfBadRequest(final boolean expression, final String message) {
		if (expression) {
			throw new ApiRestBadRequestException(message);
		}
	}

	public static void checkIfPathRequestExist(final String id) {
		if (Utilitario.validarValorVacioONulo(id)) {
			throw new ApiRestBadRequestException("Debe ingresar id");
		}
	}

}
