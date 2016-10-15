package es.upm.miw.apiArchitectureSport.daos.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import es.upm.miw.apiArchitectureSport.daos.SportDao;
import es.upm.miw.apiArchitectureTheme.entities.Sport;

public class VoteDaoMemory extends GenericMemoryDao<Sport> implements SportDao {

	public VoteDaoMemory() {
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

	@Override
	public List<Integer> findValueByThemeId(int themeId) {
		List<Sport> votes = this.findAll();
		List<Integer> votesValue = new ArrayList<>();
		for (Sport vote : votes) {
			if (vote.getTheme().getId() == themeId) {
				votesValue.add(vote.getValue());
			}
		}
		return votesValue;
	}

}