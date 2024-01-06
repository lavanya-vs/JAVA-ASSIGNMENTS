package Assignment_1;

import java.util.Scanner;

public class code7 {
	public static void leapOrNot(int year) {
		if(year%4==0) {
			System.out.println(year+ " is a leap year");
		}else {
			System.out.println(year+ " is not a leap year");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter the year");
		int year=sc.nextInt();
		code7 ii=new code7();
		ii.leapOrNot(year);
		
		
		
	}

}

