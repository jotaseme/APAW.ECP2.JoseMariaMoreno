package es.upm.miw.apiArchitectureSport.wrappers;

import java.util.ArrayList;
import java.util.List;

public class UserListWrapper {
	List<UserWrapper> themeList;

	
	public UserListWrapper() {
		themeList = new ArrayList<>();
	}

	public List<UserWrapper> getThemeList() {
		return themeList;
	}

	public void addThemeWrapper(UserWrapper themeWrapper){
		themeList.add(themeWrapper);
	}
	

	@Override
	public String toString() {
		String result = "{\"themeList\":[ ";
		for (UserWrapper themeWrapper : themeList) {
			result += themeWrapper.toString() + ",";
		}
		return result.substring(0, result.length() - 1) + "]}";
	}
}
