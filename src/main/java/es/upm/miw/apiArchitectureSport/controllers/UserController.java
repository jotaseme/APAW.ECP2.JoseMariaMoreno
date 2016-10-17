package es.upm.miw.apiArchitectureSport.controllers;

import java.util.List;

import es.upm.miw.apiArchitectureSport.daos.DaoFactory;
import es.upm.miw.apiArchitectureSport.wrappers.UserListWrapper;
import es.upm.miw.apiArchitectureSport.wrappers.UserWrapper;
import es.upm.miw.apiArchitectureTheme.entities.User;


public class UserController {

	public UserListWrapper userList() {
		List<User> userList = DaoFactory.getFactory().getUserDao().findAll();
		UserListWrapper userListWrapper = new UserListWrapper();
		for (User user : userList) {
			userListWrapper.addUserWrapper(new UserWrapper(user.getNick(), user.getEmail()));
		}
		return userListWrapper;
	}

	public void createUser(String nick, String email) {
		DaoFactory.getFactory().getUserDao().create(new User(nick, email));
	}
	
	public boolean checkIfExistsUserNick(String nick){
		if (DaoFactory.getFactory().getUserDao().read(nick) == null) {
            return false;
        }else{
            return true;
        }	
	}

	public void updateUserSportList(String nick, String sportName) {
		DaoFactory.getFactory().getUserDao().updateUserSportList(nick,sportName);	
	}
	
	public UserListWrapper findUserBySportName(String sportName){
		List<User> userList = DaoFactory.getFactory().getUserDao().findUserBySportName(sportName);
		UserListWrapper userListWrapper = new UserListWrapper();
		for (User user : userList) {
			userListWrapper.addUserWrapper(new UserWrapper(user.getNick()));
		}
		return userListWrapper;
	}
}
