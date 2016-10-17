package es.upm.miw.apiArchitectureSport.api;

import es.upm.miw.apiArchitectureSport.controllers.SportController;
import es.upm.miw.apiArchitectureSport.controllers.UserController;

import es.upm.miw.apiArchitectureSport.wrappers.UserListWrapper;
import es.upm.miw.apiArchitectureSport.exceptions.ExistingUserException;
import es.upm.miw.apiArchitectureSport.exceptions.InvalidFieldException;


public class UserResource {

	// GET **/users
	public UserListWrapper userList() {
		return new UserController().userList();
	}

	// POST **/users   body="nick:email""
	public void createUser(String nick, String email) throws InvalidFieldException,ExistingUserException {
		this.validateField(nick);
		this.validateField(email);
		if(new UserController().checkIfExistsUserNick(nick)==false){
			new UserController().createUser(nick,email);
		}else{
			throw new ExistingUserException ("" + nick);
		}
		
	}

	private void validateField(String field) throws InvalidFieldException {
		if (field == null || field.isEmpty()) {
			throw new InvalidFieldException(field);
		}
	}

	//PUT **/users/{nick}/sport
	public void updateSportList(String nick, String sportName) throws InvalidFieldException, ExistingUserException {
		this.validateField(nick);
		this.validateField(sportName);
		if(new UserController().checkIfExistsUserNick(nick)==true && new SportController().checkIfExistsSport(sportName)==false){
			new UserController().updateUserSportList(nick, sportName);
		}
		else{
			throw new ExistingUserException ("" + nick);
		}
	}

}
