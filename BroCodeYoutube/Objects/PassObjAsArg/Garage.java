package BroCodeYoutube.Objects.PassObjAsArg;

public class Garage {
	 void Park(Car car, Bicycle bike) {
		 System.out.println("The "+car.name+" is parked.");
		 System.out.println("The "+bike.name+" is parked.");
	 }
}
