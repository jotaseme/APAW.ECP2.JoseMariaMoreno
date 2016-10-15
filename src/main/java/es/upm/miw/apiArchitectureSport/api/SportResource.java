package es.upm.miw.apiArchitectureSport.api;

import es.upm.miw.apiArchitectureSport.controllers.UserController;
import es.upm.miw.apiArchitectureSport.controllers.SportController;
import es.upm.miw.apiArchitectureSport.exceptions.InvalidThemeFieldException;
//import es.upm.miw.apiArchitectureSport.exceptions.InvalidVoteException;
//import es.upm.miw.apiArchitectureSport.exceptions.NotFoundThemeIdException;
import es.upm.miw.apiArchitectureSport.wrappers.VoteListWrapper;

public class SportResource {

	// POST **/sports   body="name"
	public void createSport(String name) throws InvalidThemeFieldException {
		this.validateField(name);
		new SportController().createSport(name);
	}
	
	private void validateField(String field) throws InvalidThemeFieldException {
		if (field == null || field.isEmpty()) {
			throw new InvalidThemeFieldException(field);
		}
	}

	// GET **/votes
	public VoteListWrapper voteList() {
		return new SportController().voteList();
	}

}
