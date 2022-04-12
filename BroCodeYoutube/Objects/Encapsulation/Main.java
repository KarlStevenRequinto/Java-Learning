package BroCodeYoutube.Objects.Encapsulation;

public class Main {
	 // ENCAPSULATION = ATTRIBUTES OP A CLASS WILL BE HIDDEN OR PRIVATE,
//						CAN BE ACCESSED ONLY THROUGH GETTERS AND SETTERS
//						YOU SHOULD MAKE ATTRIBUTES PRIVATE IF YOU DONT HAVE A REASON TO MAKE THEM PUBLIC
	
	public static void main(String[] args) {
		Car car1 = new Car("Chevrolet","Camaro",2021);
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
	
		car1.setYear(2022);
		System.out.println(car1.getYear());
	}
}
