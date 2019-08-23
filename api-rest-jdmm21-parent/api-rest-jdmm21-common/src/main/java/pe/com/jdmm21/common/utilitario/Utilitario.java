package pe.com.jdmm21.common.utilitario;

import pe.com.jdmm21.common.exception.condition.RestPreCondition;

public class Utilitario {
	
	private Utilitario() {
		
	}

	public static boolean validateEmptyOrNullField(String fieldName, String fieldValue) {
		if (validarValorVacioONulo(fieldValue)) {
			String mensajeExcepcion = new StringBuilder().append(Constantes.STRING_FIELD).append(fieldName)
					.append(Constantes.STRING_CANT_BE_EMPTY).toString();
			RestPreCondition.checkIfBadRequest(true, mensajeExcepcion);
		}
		return false;
	}

	public static boolean validarValorVacioONulo(String value) {
		return (value.equals(Constantes.EMPTY_VALUE) || value == null);
	}

}
