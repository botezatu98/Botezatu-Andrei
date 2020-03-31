package Clase;

public class Adress {
	String street;
	String city;
	int number;

	public Adress(String street, String city, int number) {
		this.street = street;
		this.city = city;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Adress{" + "street=" + street + ", city=" + city + ", number=" + number + '}';
	}

	public String getstreet() {
		return "Street: " + street;
	}

	public String getcity() {
		return "City:" + city;
	}

	public String getnumber() {
		return "Number:" + number;
	}

	public String getFullAdress() {
		return "Street:" + street + " , City:" + city + " ,  Number:" + number;
	}

}
