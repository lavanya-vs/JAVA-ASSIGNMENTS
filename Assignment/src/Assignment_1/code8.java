package Assignment_1;

import java.util.Scanner;

public class code8 {
public static void prime(int num) {
	if(num<=1) {
		System.out.println("the number's less than 1 is not a prime number");
	}
	else {
		for(int i=2;i<num/2;i++){
		if(num%i==0) {
			System.out.println("not a prime number");
			 return;  //to exit
		}
	}
			System.out.println("prime number");
            
	}	
}

public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number ");
	int num=sc.nextInt();
	 code8 onk=new code8();
	 onk.prime(num);
	
		
		
	}
}

	

	
