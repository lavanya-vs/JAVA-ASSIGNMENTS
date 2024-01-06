package Assignment_1;

import java.util.Scanner;


public class code14 {
	    public static void isArmstrong(int start, int end) {
	        for (int num = start; num <= end; num++) {
	            int temp = num;
	            int sum = 0;
	            while (temp != 0) {
	                int r = temp % 10;
	                sum = sum + (r * r * r);
	                temp = temp / 10;
	            }
	            if (sum == num) {
	                System.out.print(num + " ");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the starting range: ");
	        int start = sc.nextInt();
	        System.out.println("Enter the ending range: ");
	        int end = sc.nextInt();
	        code14.isArmstrong(start, end);
	    }
	}