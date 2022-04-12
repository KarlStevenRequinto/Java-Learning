package BroCodeYoutube.Objects.Interface;

public class Main {
	// INTERFACE = A TEMPLATE THAT CAN BE APPLIED TO A CLASS.
	//             SIMILAR TO INHERITANCE, BUT SPECIFIES WHAT A CLASS HAS/MUST DO.
	//			   CLASSES CAN APPLY MORE THAN ONE INTERFACE, INHERITANCE IS LIMITED TO 1 SUPER
	public static void main(String[] args) {
		Rabbit rabbit = new Rabbit();
		rabbit.flee();
		
		Hawk hawk = new Hawk();
		hawk.hunt();
		
		Fish fish = new Fish();
		fish.hunt();
		fish.flee();
	}
}
