package es.upm.miw.apiArchitectureSport.daos.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import es.upm.miw.apiArchitectureSport.daos.SportDao;
import es.upm.miw.apiArchitectureTheme.entities.Sport;

public class SportDaoMemory extends GenericMemoryDao<Sport> implements SportDao {

	public SportDaoMemory() {
		this.setMap(new HashMap<Integer,Sport>());
	}

	@Override
	protected Integer getId(Sport entity) {
		return entity.getId();
	}

	@Override
	protected void setId(Sport entity, Integer id) {
		entity.setId(id);
	}

	

}