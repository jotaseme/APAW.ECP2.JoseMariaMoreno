package es.upm.miw.apiArchitectureSport.daos;

import java.util.List;

import es.upm.miw.apiArchitectureTheme.entities.Sport;

public interface SportDao extends GenericDao<Sport, Integer> {
	List<Integer> findValueByThemeId(int themeId);
}
