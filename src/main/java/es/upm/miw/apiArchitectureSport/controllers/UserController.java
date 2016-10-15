package es.upm.miw.apiArchitectureSport.controllers;

import java.util.List;

import es.upm.miw.apiArchitectureSport.daos.DaoFactory;
import es.upm.miw.apiArchitectureSport.wrappers.UserListWrapper;
import es.upm.miw.apiArchitectureSport.wrappers.UserWrapper;
import es.upm.miw.apiArchitectureTheme.entities.User;


public class UserController {

	/*public UserListWrapper themeList() {
		List<User> themeList = DaoFactory.getFactory().getUserDao().findAll();
		UserListWrapper themeListWrapper = new UserListWrapper();
		for (User theme : themeList) {
			themeListWrapper.addThemeWrapper(new ThemeWrapper(theme.getId(), theme.getName()));
		}
		return themeListWrapper;
	}*/

	public void createUser(String nick, String email) {
		DaoFactory.getFactory().getUserDao().create(new User(nick, email));
	}

	/*public OverageWrapper themeOverage(int themeId) {
		if (DaoFactory.getFactory().getUserDao().read(themeId) == null) {
			return null;
		}
		List<Integer> voteValues = DaoFactory.getFactory().getVoteDao().findValueByThemeId(themeId);
		double total = 0;
		for (Integer value : voteValues) {
			total += value;
		}
		return new OverageWrapper(total / voteValues.size());
	}*/

	public UserListWrapper userList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean checkIfExistsUserNick(String nick){
		if (DaoFactory.getFactory().getUserDao().read(nick) == null) {
            return false;
        }else{
            return true;
        }
		
	}

}
