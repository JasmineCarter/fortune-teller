import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Hello, what is your first name?");
		String firstName = input.next();
		System.out.println("Thank you! What is your last name?");
		String lastName = input.next();
		System.out.println("Great! How old are you?");
		int age = input.nextInt();
		System.out.println("Doing great! What month were you born (please give the numerical answer)?");
		int birthMonth = input.nextInt();

		input.nextLine();

		System.out.println("What is your favorite ROYGBIV color? (If you do not know what ROYGBIV means, type HELP.)");

		String favColor = input.nextLine();

		if (favColor.equalsIgnoreCase("help")) {
			System.out.println("You can pick from the colors: RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET");
			favColor = input.nextLine();

	
		}
		System.out.println("How many siblings do you have?");
		String siblings = input.nextLine(); 
		
		int retirementAge = 0; 
		
		if (age % 2 == 0) {
		System.out.println("You will retire in 20 years.");
		
		}else {
			System.out.println("You will retire in 5 years.");
		}
		
		
		
	}

}