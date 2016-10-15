package es.upm.miw.apiArchitectureSport.controllers;

import java.util.List;

import es.upm.miw.apiArchitectureSport.daos.DaoFactory;
import es.upm.miw.apiArchitectureSport.wrappers.VoteListWrapper;
import es.upm.miw.apiArchitectureSport.wrappers.VoteWrapper;
import es.upm.miw.apiArchitectureTheme.entities.User;
import es.upm.miw.apiArchitectureTheme.entities.Sport;

public class SportController {

	public void createSport(String name) {
		DaoFactory.getFactory().getSportDao().create(new Sport(name));
	}

	/*public SportListWrapper voteList() {
		List<Sport> sports = DaoFactory.getFactory().getSportDao().findAll();
		SportListWrapper sportListWrapper = new SportListWrapper();
		for (Sport sport : sports) {
			sportsListWrapper.addVoteWrapper(new VoteWrapper(vote.getTheme().getName(),vote.getValue()));
		}
		return voteListWrapper;
	}*/

}
