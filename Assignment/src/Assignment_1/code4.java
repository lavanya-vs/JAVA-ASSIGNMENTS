package Assignment_1;

import java.util.Scanner;

public class code4 {
	public static void greatest(int num1,int num2)
	{
		if(num1>num2) {
			System.out.println(num1+ "is greater");
		}
		else {
			System.out.println(num2+" is greater");
		}
	}

	public static void main(String[] args) {
		Scanner as=new Scanner (System.in);
		System.out.println("enter number 1");
		int num1=as.nextInt();
		System.out.println("enter number 2");
		int num2=as.nextInt();
		code4 ohj=new code4();
		ohj.greatest(num1,num2);
		
		

	}

}
