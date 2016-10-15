package es.upm.miw.apiArchitectureSport.daos.memory;

import java.util.HashMap;

import es.upm.miw.apiArchitectureSport.daos.ThemeDao;
import es.upm.miw.apiArchitectureTheme.entities.Theme;

public class ThemeDaoMemory extends GenericMemoryDao<Theme> implements ThemeDao {

	public ThemeDaoMemory() {
		this.setMap(new HashMap<Integer, Theme>());
	}

	@Override
	protected Integer getId(Theme entity) {
		return entity.getId();
	}

	@Override
	protected void setId(Theme entity, Integer id) { // COPIAR PERO CAMBIANDO NOMBRES PARA NUESTRA PRACTICA
		entity.setId(id);

	}

}