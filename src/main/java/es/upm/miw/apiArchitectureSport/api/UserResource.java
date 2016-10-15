package es.upm.miw.apiArchitectureSport.api;

import es.upm.miw.apiArchitectureSport.controllers.UserController;
import es.upm.miw.apiArchitectureSport.wrappers.OverageWrapper;
import es.upm.miw.apiArchitectureSport.wrappers.UserListWrapper;
import es.upm.miw.apiArchitectureSport.exceptions.InvalidThemeFieldException;
import es.upm.miw.apiArchitectureSport.exceptions.NotFoundThemeIdException;

public class UserResource {

	// GET **/users
	public UserListWrapper userList() {
		return new UserController().userList();
	}

	// POST **/users   body="nick:email""
	public void createUser(String nick, String email) throws InvalidThemeFieldException {
		this.validateField(nick);
		this.validateField(email);
		new UserController().createUser(nick,email);
	}

	private void validateField(String field) throws InvalidThemeFieldException {
		if (field == null || field.isEmpty()) {
			throw new InvalidThemeFieldException(field);
		}
	}

	// GET **themes/{id}/overage
	public OverageWrapper themeOverage(int themeId) throws NotFoundThemeIdException {
		OverageWrapper overageWrapper = new UserController().themeOverage(themeId);
		if (overageWrapper == null) {
			throw new NotFoundThemeIdException("" + themeId);
		} else {
			return overageWrapper;
		}
	}

}
