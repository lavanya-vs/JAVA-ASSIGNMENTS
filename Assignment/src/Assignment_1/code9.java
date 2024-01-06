package Assignment_1;

import java.util.Scanner;

public class code9 {
	public static void prime(int num1,int num2) {
		for(int i=num1;i<=num2;i++) {
			if (prime1(i)) {
                System.out.println(i + " is a prime number");
            }
		}
			
	}
	
	public static boolean prime1(int num) {
		
			for(int i=2;i<num/2;i++){
			if(num%i==0) {
				
				 return false;  
			}
		}
			return true;
	            
		}
	
	
 

	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number 1");
		int num1=sc.nextInt();
		System.out.println("enter number 2");
		int num2=sc.nextInt();
		System.out.println("Prime numbers in the interval :");
        prime(num1, num2);
		

	}

}



