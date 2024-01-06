package Assignment_1;

import java.util.Scanner;
public class code2 {
	public void  evenorodd(int num) {
		if(num%2==0)
		{
			System.out.println("the number is even");
		}
		else {
			System.out.println("the number is odd");
		}
		
	}

	public static void main(String[] args) {
		Scanner ab=new Scanner (System.in);
		System.out.println("enter a number");
		int num=ab.nextInt();
		code2 objj=new code2();
		objj.evenorodd(num);
	}

}