package es.upm.miw.apiArchitectureSport.controllers;


import es.upm.miw.apiArchitectureSport.daos.DaoFactory;
import es.upm.miw.apiArchitectureTheme.entities.Sport;

public class SportController {

	public void createSport(String name) {
		DaoFactory.getFactory().getSportDao().create(new Sport(name));
	}
	
	public boolean checkIfExistsSport(String name){
		if (DaoFactory.getFactory().getSportDao().read(name) == null) {
            return false;
        }else{
            return true;
        }
		
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
