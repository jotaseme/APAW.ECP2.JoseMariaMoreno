package es.upm.miw.apiArchitectureSport.api;

import es.upm.miw.apiArchitectureSport.controllers.SportController;
import es.upm.miw.apiArchitectureSport.exceptions.ExistingSportException;
import es.upm.miw.apiArchitectureSport.exceptions.InvalidSportNameFieldException;

public class SportResource {

	// POST **/sports   body="name"
	public void createSport(String name) throws InvalidSportNameFieldException, ExistingSportException{
		this.validateField(name);
		
		if(new SportController().checkIfExistsSport(name)==false){
			new SportController().createSport(name);
		}else{
			throw new ExistingSportException ("" + name);
		}
		
	}
	
	private void validateField(String field) throws InvalidSportNameFieldException {
		if (field == null || field.isEmpty()) {
			throw new InvalidSportNameFieldException(field);
		}
	}

	// GET **/votes
	//public VoteListWrapper voteList() {
	//	return new SportController().voteList();
	//}

}
