package es.upm.miw.apiArchitectureSport.daos.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import es.upm.miw.apiArchitectureSport.daos.VoteDao;
import es.upm.miw.apiArchitectureTheme.entities.Vote;

public class VoteDaoMemory extends GenericMemoryDao<Vote> implements VoteDao {

	public VoteDaoMemory() {
		this.setMap(new HashMap<Integer,Vote>());
	}

	@Override
	protected Integer getId(Vote entity) {
		return entity.getId();
	}

	@Override
	protected void setId(Vote entity, Integer id) {
		entity.setId(id);
	}

	@Override
	public List<Integer> findValueByThemeId(int themeId) {
		List<Vote> votes = this.findAll();
		List<Integer> votesValue = new ArrayList<>();
		for (Vote vote : votes) {
			if (vote.getTheme().getId() == themeId) {
				votesValue.add(vote.getValue());
			}
		}
		return votesValue;
	}

}