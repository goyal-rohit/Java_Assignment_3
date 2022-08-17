package Assignment_3;
//WAP to check if the String is Pangram or not
import java.util.Scanner;

class Pangram {
	public void allLetters(String str) {
		str = str.toLowerCase();
		boolean result = true;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!str.contains(String.valueOf(ch))) {
				result = false;
				break;
			}

		}
		if (result) {
			System.out.println("The entered string is Pangram");
		} else {
			System.out.println("The entered string is not Pangram");
		}
	}

}


public class Assignment_3_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st string to check for Pangram : ");
		String str_1 = scan.nextLine();
		scan.close();
		Pangram pangram = new Pangram();
		pangram.allLetters(str_1);

	}

}
