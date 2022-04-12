package BroCodeYoutube.Objects.OverloadedConstructors;

public class Pizza {
	String bread;
	String sauce;
	String cheese;
	String topping;
	
	public Pizza(String bread,String sauce,String cheese,String topping) {
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
	
//	IF YOU WANT TO CALL A PIZZA WITH 3 ARGUMENTS/PARAMETERS
	public Pizza(String bread,String sauce,String cheese) {
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
}
