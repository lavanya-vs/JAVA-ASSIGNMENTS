package Assignment_1;

import java.util.Scanner;

public class code17 {
	public static void fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("the factorial is " +fact);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the number ");
		int num = sc.nextInt();
		code17 pp = new code17();
		pp.fact(num);

	}

}


