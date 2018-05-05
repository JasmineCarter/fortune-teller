import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Hello, what is your first name?");
		String firstName = input.next();
		System.out.println("Thank you! What is your last name?");
		String lastName = input.next();
		System.out.println("Great! How old are you?");
		String age = input.next();
		System.out.println("Doing great! What month were you born (please give the numerical answer)?");
		int birthMonth = input.nextInt();

	}

}