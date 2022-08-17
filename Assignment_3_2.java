package Assignment_3;

//WAP to reverse a sentence while preserving the position
public class Assignment_3_2 {

	public static void main(String[] args) {

		String s1 = "Think Twice";
		String s2 = "";
		String reverse = "";
		String[] split = s1.split(" ");

		for (int i = split.length - 1; i >= 0; i--) {
			s2 = s2 + split[i] + " ";
		}
		s2 = s2.trim();
		// System.out.println(s2);

		for (int i = s2.length() - 1; i >= 0; i--) {
			reverse = reverse + s2.charAt(i);
		}
		System.out.println(reverse);
	}

}
