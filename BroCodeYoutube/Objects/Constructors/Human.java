package BroCodeYoutube.Objects.Constructors;

public class Human {
	String name;
	int age;
	double weight;
	
	Human(String name, int age, double weight){
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(name+" is eating");
	}
	
	void drink() {
		System.out.println(name+" is drinking");
	}
	
}
