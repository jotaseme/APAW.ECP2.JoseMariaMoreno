package es.upm.miw.apiArchitectureSport.daos;

import java.util.List;

import es.upm.miw.apiArchitectureTheme.entities.User;

public interface UserDao extends GenericDao<User, String> {
	List<User> findUserBySportName(String sportName);
	void updateUserSportList(String nick, String sportName);
	
}
