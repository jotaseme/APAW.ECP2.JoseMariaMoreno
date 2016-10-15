package es.upm.miw.apiArchitectureSport.daos.memory;

import java.util.HashMap;


import es.upm.miw.apiArchitectureSport.daos.SportDao;
import es.upm.miw.apiArchitectureTheme.entities.Sport;

public class SportDaoMemory extends GenericMemoryDao<Sport> implements SportDao {

	public SportDaoMemory() {
		this.setMap(new HashMap<String,Sport>());
	}

	@Override
	protected String getId(Sport entity) {
		return entity.getName();
	}

	@Override
	protected void setId(Sport entity, String id) {
		entity.setName(id);
	}

	

}