package Assignment_3;

import java.util.Scanner;

//WAP to count the number of Vowels and Consonants of a String value.
public class Assignment_3_7 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String to count the number of Vowels and Consonants : ");
		String str = scan.nextLine();
		scan.close();
		str = str.toLowerCase();
		char arr[] = str.toCharArray();
		int len = str.length();
		int vowel_count = 0;
		char vowel[] = { 'a', 'e', 'i', 'o', 'u' };
		for (char arr2 : arr) {
			for (char ch : vowel) {
				if (arr2 == ch) {
					vowel_count++;
				}
			}
		}

		System.out.println("The number of Vowels in the given string is : " + vowel_count);
		System.out.println("The number of Consonants in the given string is : " + (len - vowel_count));

	}
}
