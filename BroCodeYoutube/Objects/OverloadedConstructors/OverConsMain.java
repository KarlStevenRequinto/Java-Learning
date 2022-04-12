package BroCodeYoutube.Objects.OverloadedConstructors;

public class OverConsMain {
	//OVERLOAD CONSTRUCTORS = MULTIPLE CONSTRUCTOR WITHIN A CLASS WITH THE SAME NAME,
	//                        BUT HAVE DIFFERENT PARAMETERS
	//                        NAME + PARAMETERS = SIGNATURE
	
	public static void main(String[] args) {
		Pizza pizza = new Pizza("bread1","sauce1","cheese1","topping1");
		System.out.println("here are the ingredients of your pizza: ");
		System.out.println(pizza.bread +", "+pizza.sauce+", "+pizza.cheese+", "+pizza.topping);
	}
}
