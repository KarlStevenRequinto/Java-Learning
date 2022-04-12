package BroCodeYoutube.Objects.StaticKeyWord;

public class Main {
	// STATIC = MODIFIER. A SINGLE COPY OF A VARIABLE/METHOD IS CREATED AND SHARED.
	//			THE CLASS "OWNS" THE STATIC MEMBER
	public static void main(String[] args) {
		Friend friend1 = new Friend("Kilo");
		Friend friend2 = new Friend("Kheeton");
		Friend friend3 = new Friend("Lucas");
		Friend friend4 = new Friend("Lucas");
		System.out.println(Friend.numberOfFriends);
		
		
		Friend.displayFriends();
	}
}
