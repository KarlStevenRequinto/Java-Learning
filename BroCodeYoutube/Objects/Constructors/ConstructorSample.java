package BroCodeYoutube.Objects.Constructors;

public class ConstructorSample {
	// CONSTRUCTORS = SPECIAL METHOD THAT IS CALLED WHEN AN OBJECT IS INSTANTIATED/CREATE
	
	public static void main(String[] args) {
		Human human1 = new Human("Karl",31, 60.3);
		Human human2 = new Human("Steven",3, 61.3);
		System.out.println(human1.age);
		System.out.println(human2.age);
		
		human1.drink();
		human2.eat();
	}
}
