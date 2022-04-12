package BroCodeYoutube.Objects.Polymorphism;

public class Main {
	// POLYMORPHISM = POLY - "MANY" , MORPH - "FORM"
	// 				  THE ABILITY OF AN OBJECT TO IDENTIFY AS MORE THAN ONE TYPE
	
	public static void main(String[] args) {
		Car car = new Car();
		Bicycle bike = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car,bike,boat};
		
		for(Vehicle x: racers) {
			x.go();
		}
		
	}
}
