package es.upm.miw.apiArchitectureTheme.entities;

public class Sport {

	private String name;

	public Sport() {
	}

	public Sport(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Sport [name=" + name + "]";
	}

}
