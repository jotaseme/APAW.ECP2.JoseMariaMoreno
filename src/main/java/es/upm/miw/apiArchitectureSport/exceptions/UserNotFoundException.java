package es.upm.miw.apiArchitectureSport.exceptions;

public class UserNotFoundException extends Exception {
	private static final long serialVersionUID = -3893110892899234744L;
	
	public static final String DESCRIPTION = "El usuario no se ha encontrado";

	public UserNotFoundException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

	public UserNotFoundException() {
		this("");
	}
}
