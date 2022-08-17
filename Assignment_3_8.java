package Assignment_3;

import java.util.Scanner;

//WAP to count number of special characters.
public class Assignment_3_8 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String to count the number of special characters : ");
		String str = scan.nextLine();
		scan.close();
		int special =0;
		for (int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'||ch>='0'&&ch<='9')) {
				special++;
			}
		}
	System.out.println("The number of special characters in the given string is : "+special);
	}
}
