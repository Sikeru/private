package ex16;

public class Research extends Employee {
	private String position;

	public Research(String name, String position) {
		super.name = name;
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
