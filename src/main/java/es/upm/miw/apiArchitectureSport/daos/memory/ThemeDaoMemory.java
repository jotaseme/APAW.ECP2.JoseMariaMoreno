package es.upm.miw.apiArchitectureSport.daos.memory;

import java.util.HashMap;

import es.upm.miw.apiArchitectureSport.daos.UserDao;
import es.upm.miw.apiArchitectureTheme.entities.User;

public class ThemeDaoMemory extends GenericMemoryDao<User> implements UserDao {

	public ThemeDaoMemory() {
		this.setMap(new HashMap<Integer, User>());
	}

	@Override
	protected Integer getId(User entity) {
		return entity.getId();
	}

	@Override
	protected void setId(User entity, Integer id) { // COPIAR PERO CAMBIANDO NOMBRES PARA NUESTRA PRACTICA
		entity.setId(id);

	}

}