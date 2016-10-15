package es.upm.miw.apiArchitectureSport.daos.memory;

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
	public List<String> findUserBySportName(String sportName) {
		// TODO Auto-generated method stub
		return null;
	}

}