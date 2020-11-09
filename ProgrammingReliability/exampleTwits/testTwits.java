public class TestTwits {
	
	public static void main(String[] args) {
		Twits mytwit = new Twits("James", "Today is a great day! Cleveland Indians won the game!");
		
		// Below statement is not allowed because setMessage is private and cannot be used by class TestTwits
    // This avoid objects of other classes (except Twits class) changing an existing twits. 
		mytwit.setMessage("Today is the worst day! Cleveland Indians lost the game!");
	}
}
