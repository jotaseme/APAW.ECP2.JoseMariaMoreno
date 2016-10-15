package es.upm.miw.apiArchitectureSport.daos.memory;

import es.upm.miw.apiArchitectureSport.daos.DaoFactory;
import es.upm.miw.apiArchitectureSport.daos.UserDao;
import es.upm.miw.apiArchitectureSport.daos.SportDao;

public class DaoFactoryMemory extends DaoFactory {

	private UserDao themeDao;
	private SportDao voteDao;

	public DaoFactoryMemory() {
	}

	@Override
	public UserDao getThemeDao() {
		if (themeDao == null) {
			themeDao = new ThemeDaoMemory();
		}
		return themeDao;
	}

	@Override
	public SportDao getVoteDao() {
		if (voteDao == null) {
			voteDao = new VoteDaoMemory();
		}
		return voteDao;
	}

}
