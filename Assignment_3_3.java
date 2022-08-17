package Assignment_3;

import java.util.Scanner;

//WAP to check if two Strings inputed by user are Anagram or not

class Sort {
	public String Sort_Alphabetically(String str) {
		str = str.toLowerCase();
		char str_arr[] = str.toCharArray();
		int i = 0;
		char temp;
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

		return new String(str_arr);
	}
}

public class Assignment_3_3 {
	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.print("Enter 1st string to check for Anagram : ");
		String str_1 = scan1.nextLine();
		System.out.print("Enter 2nd string to check for Anagram : ");
		String str_2 = scan2.nextLine();
		scan1.close();
		scan2.close();
		Sort sort = new Sort();
		String sorted_1 = sort.Sort_Alphabetically(str_1);
		String sorted_2 = sort.Sort_Alphabetically(str_2);
		if (sorted_1.equals(sorted_2)) {
			System.out.println("The Strings entered are Anagram to each other.");
		} else {
			System.out.println("The Strings entered are not Anagram to each other.");
		}

	}

}
