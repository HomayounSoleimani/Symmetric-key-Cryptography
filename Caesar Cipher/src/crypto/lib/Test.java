package crypto.lib;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// INPUT
		System.out.print("Please enter your plaintext: ");
		String plaintext = s.nextLine();
		System.out.print("Now, Please enter a digit number as a key :");
		int key = s.nextInt();
		// TODO key range controller
		
		// PROCESS
		Encrypt en = new Encrypt();
		StringBuilder ciphertext = en.genCipher(plaintext, key);
		
		// OUTPUT
		System.out.println("---------------------------------------------");
		System.out.println("Your encrypted plaintext with desired key is:");
		System.out.println(ciphertext);
	}
}
