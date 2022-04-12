package BroCodeYoutube.Objects.LocalGlobal;

import java.util.Random;

//LOCAL VARIABLE EXAMPLE
//public class DiceRoller {
//	public DiceRoller() {
//		Random random = new Random();
//		int num = 0;
//		roll(random,num);
//	}	
//	
//	void roll(Random random, int num) {
//		num=random.nextInt(6)+1;
//		System.out.println(num);
//	};
//}
//GLOBAL VARIABLE EXAMPLE
public class DiceRoller {
	Random random;
	int num = 0;
	public DiceRoller() {
		random = new Random();
		
		roll();
	}	
	
	void roll() {
		num=random.nextInt(6)+1;
		System.out.println(num);
	};
}