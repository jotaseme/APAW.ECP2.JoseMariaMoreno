package es.upm.miw.apiArchitectureSport.api;

import es.upm.miw.apiArchitectureSport.controllers.SportController;
import es.upm.miw.apiArchitectureSport.controllers.UserController;

import es.upm.miw.apiArchitectureSport.wrappers.UserListWrapper;
import es.upm.miw.apiArchitectureSport.exceptions.ExistingUserException;
import es.upm.miw.apiArchitectureSport.exceptions.InvalidFieldException;
import es.upm.miw.apiArchitectureSport.exceptions.SportNotFoundException;
import es.upm.miw.apiArchitectureSport.exceptions.UserNotFoundException;


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
	public void updateSportList(String nick, String sportName) throws InvalidFieldException, UserNotFoundException, SportNotFoundException {
		this.validateField(nick);
		this.validateField(sportName);
		if(new UserController().checkIfExistsUserNick(nick)==true){
			if(new SportController().checkIfExistsSport(sportName)==true){
				new UserController().updateUserSportList(nick, sportName);
			}else{
				throw new SportNotFoundException ("" + sportName);
			}
		}
		else{
			throw new UserNotFoundException ("" + nick);
		}
	}
	
	// GET **/users/search?sport=*
	public UserListWrapper findUserBySportName(String sportName){
		return new UserController().findUserBySportName(sportName);
	}

}
