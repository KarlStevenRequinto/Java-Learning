package BroCodeYoutube.Objects.Polymorphism;

public class Car extends Vehicle{
	@Override
	public void go( ) {
		System.out.println("the car is moving");
	}
}
