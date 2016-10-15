package es.upm.miw.apiArchitectureSport.exceptions;

public class ExistingUserException extends Exception {
	private static final long serialVersionUID = -642045799876625537L;
	public static final String DESCRIPTION = "Nick de usuario ya existe";
	
	public ExistingUserException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

	public ExistingUserException() {
		this("");
	}
}
