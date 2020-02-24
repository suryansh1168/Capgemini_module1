package Lab1;

import java.util.Scanner;

public class IncreasingNumber {
	public static void main(String args[]) {
		int n;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		IncreasingNumber num = new IncreasingNumber();
		boolean check = num.checkNumber(n);
		System.out.println(check);
	}

	boolean checkNumber(int n) {
		int a, b;
		while (n > 0) {
			a = n % 10;
			b = (n / 10) % 10;

			if (a >= b) {
				n = n / 10;
				continue;
			} else {
				return false;
			}

		}
		return true;
	}
}
