package Assignment_1;

import java.util.Scanner;

public class code13 {
	public  void armstrong(int n) {
		int num=n;
		int sum = 0;
	
		while (n > 0) {
			int a = n % 10;
			sum = sum + (a * a * a);
			n = n / 10;
		}
		
		if (num == sum)
			System.out.print(num + " is armstrong");
		else
			System.out.print(num + " is not armstrong");
	}



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number  ");
		int n = sc.nextInt();
		
		code13 ol=new code13();
		ol.armstrong(n);
		
	}		
		
}
