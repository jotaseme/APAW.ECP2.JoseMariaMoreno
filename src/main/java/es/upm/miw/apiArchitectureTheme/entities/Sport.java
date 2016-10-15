package es.upm.miw.apiArchitectureTheme.entities;

public class Sport {

	private int id;

	private int name;

	private User user;

	public Sport() {
	}

	public Sport(int name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValue() {
		return name;
	}


	@Override
	public String toString() {
		return "Sport [id=" + id + ", name=" + name + "]";
	}

}
