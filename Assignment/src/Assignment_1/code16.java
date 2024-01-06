package Assignment_1;

import java.util.Scanner;

public class code16 {
	public static int fib(int n) {
		int num1 = 0;
		int num2 = 1;
		int num3;
	     if (n == 0)
	       return num1;
	     for (int i = 2; i <= n; i++) {
	       num3 = num2 + num1;
	       num1 = num2;
	       num2 = num3;
	     }
	     return num2;
	   }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("enter  value of n ");
        int n = sc.nextInt();
        code16 pp =new code16() ;
		pp.fib(n);
		
		System.out.println(fib(n));
	}
}

