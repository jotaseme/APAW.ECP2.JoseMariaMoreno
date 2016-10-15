package es.upm.miw.apiArchitectureSport.exceptions;

public class ExistingSportException extends Exception {
	private static final long serialVersionUID = -642045799876625537L;
	public static final String DESCRIPTION = "El nombre del deporte ya existe: ";
	
	public ExistingSportException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

	public ExistingSportException() {
		this("");
	}
}
