package BroCodeYoutube.Objects.Inheritance;

public class Main {
	// INHERITANCE = THE PROCESS WHERE ONE CLASS ACQUIRES,
	//				 THE ATTRIBUTES AND METHODS OF ANOTHER.
	// SUB CLASS = "IS A"
	public static void main(String[] args) {
		Car car = new Car();
		Bicycle bike = new Bicycle();
		car.go();
		bike.stop();
		System.out.println(car.doors);
		System.out.println(bike.pedals);
	}
}
