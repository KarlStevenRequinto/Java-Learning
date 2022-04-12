package BroCodeYoutube.Objects.AbstractKeyWord;

public class Main {
	// ABSTRACT = CANNOT BE INSTANTIATED, BUT THEY CAN HAVE A SUBCLASS
	//            ABSTRACT METHODS ARE DECLARED WITHOUT AN IMPLEMENTATION
	
	//	Vehicle vehicle = new Vehicle(); --- with ABSTRACT KEYWORD IN VEHICLE CLASS
	public static void main(String[] args) {
		Car car = new Car();
		car.go();
	}
	
}
