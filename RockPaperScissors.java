import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
	  /*
    This program allows the user to play Rock, Paper, Scissors against the computer.
    Author: Declan
    Date: 17/11/23
    */
		
		String myGuess = getYourGuess();
		System.out.println("You choose: " +myGuess+ "!");
		String compGuess = getCompGuess();
		System.out.println("The computer chooses: " +compGuess+"!");
		
		getResult(myGuess,compGuess);
		
	}
	
		public static String getYourGuess() {
		
		Scanner sc = new Scanner(System.in);
		boolean quit = true;
		int myGuess = 0;
		
		while(quit) {
			System.out.println("Choose 1, 2 or 3.");
			System.out.println("1. Rock");
			System.out.println("2. Paper");
			System.out.println("3. Scissors");
			myGuess = sc.nextInt();
		
				if(myGuess >= 1 && myGuess <= 3) {
					quit = false;
				}
				else {
					System.out.println("Please choose 1, 2 or 3.");
				}
			}
		sc.close();
		
		String strMyGuess = "";
		
			if(myGuess == 1) {
				strMyGuess = "Rock";
			}
			else if(myGuess == 2) {
				strMyGuess = "Paper";
			}
			else {
				strMyGuess = "Scissors";
			}
		
			return strMyGuess;
		}
		
		public static String getCompGuess() {
			
			int compGuess = (int)(Math.random()*3)+1;
			
			String strCompGuess = "";
			
			if(compGuess == 1) {
				strCompGuess = "Rock";
			}
			else if(compGuess == 2) {
				strCompGuess = "Paper";
			}
			else {
				strCompGuess = "Scissors";
			}	
			return strCompGuess;
		}
		
		public static void getResult(String myGuess, String compGuess) {
			
			//All the tie results
			if(myGuess.equals(compGuess)) {
				System.out.println("Wow! A tie! Great minds must think alike!");
			}
			
			//All the win results
			if(myGuess.equals("Paper") && compGuess.equals("Rock") || 
			myGuess.equals("Rock") && compGuess.equals("Scissors") || 
			myGuess.equals("Scissors") && compGuess.equals("Paper")) {
				System.out.println("You win! Congratulations!");
			}
			
			//All the lose results
			if(myGuess.equals("Paper") && compGuess.equals("Scissors") || 
			myGuess.equals("Rock") && compGuess.equals("Paper") || 
			myGuess.equals("Scissors") && compGuess.equals("Rock")) {
				System.out.println("You lose! Better luck next time!");
			}	
		}
}
