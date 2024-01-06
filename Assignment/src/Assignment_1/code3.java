package Assignment_1;

import java.util.Scanner;

public class code3 {

	public static void sumofnaturalno(int num) {

		int sum = num * (num + 1) / 2;
		System.out.println("the result is " + sum);

	}

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("enter a value");
		int num = ab.nextInt();
		code3 obje = new code3();
		obje.sumofnaturalno(num);

	}

}


