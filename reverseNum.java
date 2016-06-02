package reverseNum;

import java.util.Scanner;

public class reverseNum {
	
	public static void main(String[] args) {

		//Scanner is created in order to receive input from users
		
		Scanner input = new Scanner(System.in);

		//Displays a prompt informing the user what needs to be done
		
		System.out.println("Enter a number up to 18 digits to be reversed:");

		//Stores the input into a variable of type long
		
		long num = input.nextLong();

		//Notifies the user of the input they chose
		
		System.out.println("You chose the number " + num);

		//Used to get the very last digit
		
		long reverse = num % 10;
		
		//Simple logic loop that allows the preceding logic to loop until all of the numbers have been reversed
		
		while (num != 0) {

			num = num / 10;
			long lastDigit = num % 10;
			reverse = reverse * 10 + lastDigit;

		}

		//The loop makes the final result 10 times as large as it should be, so the extra Zero is removed via division
		
		reverse = reverse / 10;

		//The final reversed output is displayed to the console
		
		System.out.println("Your number reversed is " + reverse);

	}

}
