package es.upm.miw.apiArchitectureSport.exceptions;

public class InvalidFieldException extends Exception {
	private static final long serialVersionUID = -642045799876625537L;
	public static final String DESCRIPTION = "Invalid field";

	public InvalidFieldException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

	public InvalidFieldException() {
		this("");
	}

}
