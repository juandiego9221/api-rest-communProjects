package pe.com.jdmm21.common.utilitario;

import pe.com.jdmm21.common.exception.condition.RestPreCondition;

public class Utilitario {

	public static <T> boolean validarCampoVacioNulo(String nombreCampo, String valorCampo) {
		if (validarValorVacioONulo(valorCampo)) {
			StringBuffer mensajeExcepcion = new StringBuffer();
			mensajeExcepcion.append("El campo ");
			mensajeExcepcion.append(nombreCampo);
			mensajeExcepcion.append(" no puede estar vacio");
			RestPreCondition.checkIfBadRequest(true, mensajeExcepcion.toString());
		}
		return false;
	}
	
	public static boolean validarValorVacioONulo(Object valor) {
		return (valor.equals(Constantes.VALOR_VACIO)||valor==null);
	}
	

	
}
