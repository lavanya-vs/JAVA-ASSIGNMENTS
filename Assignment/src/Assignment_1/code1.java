package Assignment_1;

import java.util.Scanner;

public class code1 {

	public  void res(int number) {

		if (number > 0) {
			System.out.println(number + " is positive");
		} else {
			System.out.println(number + " is negative");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		code1 ob=new code1();
		ob.res(number);
	}

}

