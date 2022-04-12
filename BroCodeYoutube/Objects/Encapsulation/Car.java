package BroCodeYoutube.Objects.Encapsulation;

public class Car {
	private String model;
	private String make;
	private int year;
	
	Car (String model, String make, int year) {
		this.model = model;
		this.setMake(make);
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}
