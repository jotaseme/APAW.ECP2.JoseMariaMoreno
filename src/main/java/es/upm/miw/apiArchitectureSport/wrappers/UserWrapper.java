package es.upm.miw.apiArchitectureSport.wrappers;

public class UserWrapper {
	private String nick;
	private String email;

	public UserWrapper() {
	}

	public UserWrapper(String nick, String email) {
		this.setNick(nick);
		this.setEmail(email);
	}
	public UserWrapper(String nick) {
		this.setNick(nick);
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

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "{\"nick\":\"" + nick + "\",\"email\":\"" + email + "\"}";
	}
	

	public String toStringOnlyNick() {
		return "{\"nick\":\"" + nick + "\"}";
	}

}
