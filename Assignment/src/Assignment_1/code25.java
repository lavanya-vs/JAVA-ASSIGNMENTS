package Assignment_1;

public class code25 {
	 public static int sum (int num)
	   {

	     int sum = 0;

	     for (int i = 1; i < num; i++)
	       {
	 	    if (num % i == 0)
	 	    sum = sum + i;
	       }
	     return sum;
	   }

	public static void main(String[] args) {
		int num1 = 6;
		int num2 = 28;

	     int sum2 = sum (num2);
	     int sum1 = sum (num1);

	     if (sum1 / num1 == sum2 / num2)
	       System.out.println (num1 + " and " + num2 + " are friendly pairs");
	     else
	         System.out.println (num1 + " and " + num2 + " are not friendly pairs");
	   

	  

	}

}



