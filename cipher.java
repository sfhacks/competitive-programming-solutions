import java.util.Scanner;

public class cipher {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String encrypted = in.nextLine();
		String plaintext = "";

		for (int i = 0; i < encrypted.length(); i++) {
			if (encrypted.charAt(i) == ' ')
				plaintext += " ";
			else
				plaintext += (char) (122 - (encrypted.charAt(i) - 97)); 
		}

		System.out.println(plaintext);

	}
}
