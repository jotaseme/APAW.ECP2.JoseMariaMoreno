package es.upm.miw.apiArchitectureSport.api;

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
	public String updateSportList(String nick, String sportName) {

		new UserController().updateUserSportList(nick,sportName);
		return null;
	}

	// GET **themes/{id}/overage
	/*public OverageWrapper themeOverage(int themeId) throws NotFoundThemeIdException {
		OverageWrapper overageWrapper = new UserController().themeOverage(themeId);
		if (overageWrapper == null) {
			throw new NotFoundThemeIdException("" + themeId);
		} else {
			return overageWrapper;
		}
	}*/

}
