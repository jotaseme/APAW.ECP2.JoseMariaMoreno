package es.upm.miw.apiArchitectureSport.exceptions;

public class InvalidNickFieldException extends Exception {
	private static final long serialVersionUID = -642045799876625537L;
	public static final String DESCRIPTION = "Nick incorrecto";

	public InvalidNickFieldException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

	public InvalidNickFieldException() {
		this("");
	}

}
