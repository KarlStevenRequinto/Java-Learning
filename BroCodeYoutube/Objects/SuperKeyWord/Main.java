package BroCodeYoutube.Objects.SuperKeyWord;

public class Main {
	// SUPER = REFERS TO THE SUPERCLASS(PARENT) OF AN OBJECT
	//		   VERY SIMILAR TO THE "THIS" KEYWORD
	public static void main(String[] args) {
		Hero hero1 = new Hero("Batman",42,"money");
		Hero hero2 = new Hero("Superman",43,"everything");
		
//		System.out.println(hero1.name);
//		System.out.println(hero1.age);
//		System.out.println(hero1.power);
		
		System.out.println(hero2.toString());
	}
}
