package BroCodeYoutube.Objects.Interface;

public class Fish implements Preys,Predators {

	@Override
	public void hunt() {
		System.out.println("The fish is hunting");
		
	}

	@Override
	public void flee() {
		System.out.println("The fish is fleeing");
		
	}

}
