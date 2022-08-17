package Assignment_3;

import java.util.Scanner;

//WAP to sort the String Alphabetically
public class Assignment_3_6 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String to sort Alphabetically : ");
		String str = scan.nextLine();
		scan.close();
		str = str.toLowerCase();
		char str_arr[] = str.toCharArray();
		char temp;

		int i = 0;
		while (i < str_arr.length) {
			int j = i + 1;
			while (j < str_arr.length) {
				if (str_arr[j] < str_arr[i]) {
					temp = str_arr[i];
					str_arr[i] = str_arr[j];
					str_arr[j] = temp;
				}
				j++;
			}

			i++;
		}
		System.out.println("The sorted string is : "+new String(str_arr));
	}
}
