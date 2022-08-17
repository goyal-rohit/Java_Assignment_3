package Assignment_3;

import java.util.Scanner;

//WAP to print repeatedly occurring characters in the given String.

class Check {
	public void Repeat(String str) {
		String result = "";
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					result = result + String.valueOf(ch[i]) + " ";
				}

			}
		}
		System.out.println("The repeated occuring characters are: " + result);
	}
}

public class Assignment_3_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = scan.nextLine();
		scan.close();
		str = str.toLowerCase();

		Check check = new Check();
		check.Repeat(str);

	}

}
