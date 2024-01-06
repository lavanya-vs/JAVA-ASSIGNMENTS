package Assignment_1;

import java.util.Scanner;

public class code15 {
	 public static void fibo(int n) 
	    { 
	       int num1 = 0;
	       int num2 = 1; 
	         for(int i=0;i<n;i++) {
	             
	           
	            System.out.print(num1 + " "); 
	  
	            
	            int num3 = num2 + num1; 
	            num1 = num2; 
	            num2 = num3; 
	         }
	        } 
	    

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("enter  value of n ");
        int n = sc.nextInt();
        code15 pp =new code15() ;
		pp.fibo(n);

	}

}


