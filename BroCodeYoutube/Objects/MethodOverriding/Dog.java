package BroCodeYoutube.Objects.MethodOverriding;

public class Dog extends Animal {
	
	// TO LET OTHER USERS KNOW THAT THIS IS AN OVERRIDEN METHOD
	@Override
	void speak() {
		System.out.println("the dog is speaking");
	}
}
