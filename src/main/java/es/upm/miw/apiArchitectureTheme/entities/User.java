package es.upm.miw.apiArchitectureTheme.entities;

public class User {

    private String nick;
    
    private String email;

    public User() {
    }

    public User(String name, String email) {
        this.nick = name;
        this.email = email;
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

}
