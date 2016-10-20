package es.upm.miw.apiArchitectureTheme.entities;

import java.util.ArrayList;

public class User {

    private String nick;
    
    private String email;
    
    private ArrayList <String> sportList;

    public User() {
    }

    public User(String name, String email) {
        this.nick = name;
        this.email = email;
        this.sportList = new ArrayList<String>();
    }

	public String getNick() {
        return nick;
    }
	
	public void setNick(String nick) {
		this.nick = nick;
    }
	
	public String getEmail() {
        return email;
    }
	

	@Override
	public String toString() {
		return "User [nick=" + nick + ":email=" + email + "]";
	}

	public void updateUserSportList(String sportName) {
		sportList.add(sportName);		
	}
	
	public ArrayList<String> getUserSportList(){
		return this.sportList;
	}
}
