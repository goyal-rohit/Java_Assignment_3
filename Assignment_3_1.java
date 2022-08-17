package Assignment_3;

//WAP to reverse a String
public class Assignment_3_1 {

	public static void main(String[] args) {
		String str = "iNeuron";
		String str2 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str2 = str2 + str.charAt(i);
		}
		System.out.println(str2);

	}

}
