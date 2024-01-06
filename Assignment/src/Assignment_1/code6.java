package Assignment_1;

import java.util.Scanner;

public class code6 {
	public static void greatest1(int num1,int num2,int num3)
	{
		if(num1 >= num2 && num1 >= num3) {
			System.out.println(num1+ "is greater");
		}
		else if(num2 >= num1 && num2 >= num3) {
			System.out.println(num2+" is greater");
		}
		else  {
			System.out.println(num3+" is greater");
		}
	}

	public static void main(String[] args) {
		Scanner as=new Scanner (System.in);
		System.out.println("enter number 1");
		int num1=as.nextInt();
		System.out.println("enter number 2");
		int num2=as.nextInt();
		System.out.println("enter number 3");
		int num3=as.nextInt();
		
		code6 ohj=new code6();
		ohj.greatest1(num1,num2,num3);

	}

}

