import java.io.IOException;
import java.util.Scanner;

public class CountingPi {
	/**
	 * @author jyu_6
	 * @purpose: Count the number of pi up to a point.
	 * @param args
	 */
	public static void PI(double a) {
		double Digits = Math.floor((Math.PI % 1) * (Math.pow(10.0, a)));
		System.out.println((3 + (Digits / Math.pow(10, a))) + "\n");
	}

	public static void main(String args[]) throws IOException {
		System.out.println("Enter a number (max 15 decimal places): ");
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int input = scan.nextInt();
		PI(input);	
		boolean fact = true;
		while (fact) {
			System.out.println("Enter another number: Yes or No? ");
			String input2 = scan2.nextLine();
			if (input2.equals("Yes")) {
				System.out.println("Enter a number (max 15 decmial places): ");
				input = scan.nextInt();
				PI(input);
			}else{
				fact = false;
			}

		}
		System.out.println("Goodbye!");
		scan.close();
		scan2.close();
	}

}
