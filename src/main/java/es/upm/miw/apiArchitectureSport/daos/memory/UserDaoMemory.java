package es.upm.miw.apiArchitectureSport.daos.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import es.upm.miw.apiArchitectureSport.daos.UserDao;
import es.upm.miw.apiArchitectureTheme.entities.User;

public class UserDaoMemory extends GenericMemoryDao<User> implements UserDao {

	public UserDaoMemory() {
		this.setMap(new HashMap<String, User>());
	}

	@Override
	protected String getId(User entity) {
		return entity.getNick();
	}

	@Override
	protected void setId(User entity, String nick) { 
		entity.setNick(nick);
	}

	@Override
	public List<User> findUserBySportName(String sportName) {
		List<User> AllUsers = this.findAll();
		List<User> users = new ArrayList<>();
		for (User user : AllUsers) {
			if(user.getUserSportList().contains(sportName)){
				users.add(user);
			}	
		}	
		return users;
	}

	@Override
	public void updateUserSportList(String nick, String sportName) {
		this.read(nick).updateUserSportList(sportName);
	}

}