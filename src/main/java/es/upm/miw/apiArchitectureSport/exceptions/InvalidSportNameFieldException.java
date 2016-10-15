package es.upm.miw.apiArchitectureSport.exceptions;

public class InvalidSportNameFieldException extends Exception {
	private static final long serialVersionUID = -642045799876625537L;
	public static final String DESCRIPTION = "Nombre de deporte incorrecto";

	public InvalidSportNameFieldException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

	public InvalidSportNameFieldException() {
		this("");
	}

}
