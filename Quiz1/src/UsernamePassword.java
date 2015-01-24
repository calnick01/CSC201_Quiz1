/**
 * author: Nicholas Webber
 * date: 1/24/2015
 * assignment: Quiz 1
 */

import java.util.Scanner;

public class UsernamePassword {
	public static void main(String[] args) {
		String username, password;
		int passwordLength, x = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your username");
		username = scanner.next();

		System.out.println("Enter your password");
		password = scanner.next();

		passwordLength = password.length();

		System.out.print("Hello " + username
				+ ", Welcome to CSC200 class! and Your password is ");

		while (x < passwordLength) {
			System.out.print("X");
			x++;
		}
		scanner.close();
	}
}