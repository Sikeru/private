package javaextra.has;

public class Address {
	private String city;
	private int bung;

	public Address(String city, int bung) {
		super();
		this.city = city;
		this.bung = bung;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getBung() {
		return bung;
	}

	public void setBung(int bung) {
		this.bung = bung;
	}
}
