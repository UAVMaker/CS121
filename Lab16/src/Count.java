// ************************************************************
// Count.java
//
// This program reads in strings (phrases) and counts the
// number of blank characters and certain other letters
// in the phrase.
// ************************************************************
import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		String phrase; // a string of characters
		int countBlank; // the number of blanks (spaces) in the phrase
		int length; // the length of the phrase
		char ch; // an individual character in the string
		Scanner scan = new Scanner(System.in);
		// Print a program header
		System.out.println();
		System.out.println("Character Counter");
		System.out.println();
		countBlank = 0;
		int countA = 0;
		int countE = 0;
		int countS = 0;
		int countT = 0;

		while (true) {
			// Read in a string and find its length
			System.out.print("Enter a sentence or phrase: ");
			phrase = scan.nextLine();
			String quit = "quit";

			length = phrase.length();
			if (phrase.equals(quit))
				System.exit(0);

			// Initialize counts

			// a for loop to go through the string character by character
			// and count the blank spaces

			for (int i = 0; i < length; i++) {
				ch = phrase.charAt(i);
				switch (ch) {
				case ' ':
					countBlank++;
					break;
				case 'a':
					countA++;
					break;
				case 'e':
					countE++;
					break;
				case 's':
					countS++;
					break;
				case 't':
					countT++;
					break;
				default:
					break;

				}
			}

			// Print the results
			System.out.println();
			System.out.println("Number of blank spaces: " + countBlank);
			System.out.println("Number of A's: " + countA);
			System.out.println("Number of E's: " + countE);
			System.out.println("Number of S's: " + countS);
			System.out.println("Number of T's: " + countT);
			System.out.println();
		}
	}

}