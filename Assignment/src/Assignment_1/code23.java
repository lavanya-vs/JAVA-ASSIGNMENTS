package Assignment_1;

import java.util.Scanner;

public class code23 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		         
		        System.out.print("enter a number ");
		        int num = sc.nextInt();
		        int x = num;
		        int y;
		        int sum = 0;
		         
		       while(x>0)
		        {
		            y = x%10;
		            sum = sum + y;
		            x = x/10;
		        }
		         
		        if(num%sum == 0)
		            System.out.println("  harshad number");
		        else
		            System.out.println("  not a harshad number");      
		    }
		}

	


