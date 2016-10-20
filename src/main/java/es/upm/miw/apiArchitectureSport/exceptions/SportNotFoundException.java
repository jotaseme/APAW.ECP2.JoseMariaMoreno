package es.upm.miw.apiArchitectureSport.exceptions;

public class SportNotFoundException extends Exception {
	private static final long serialVersionUID = -3893110892899234744L;
	
	public static final String DESCRIPTION = "El deporte no se ha encontrado";

	public SportNotFoundException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

	public SportNotFoundException() {
		this("");
	}
}
