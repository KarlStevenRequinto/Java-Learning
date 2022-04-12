package BroCodeYoutube.Objects.PassObjAsArg;

public class Main {
	public static void main(String[] args) {
		Garage garage = new Garage();
		Car car1 = new Car("BMW");
		Car car2 = new Car("Tesla");
		Bicycle bike1 = new Bicycle("BMX");
		Bicycle bike2 = new Bicycle("BMY");
		garage.Park(car1,bike1);
		garage.Park(car2,bike2);
		
	}
}
