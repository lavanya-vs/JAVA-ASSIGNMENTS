package Assignment_1;

public class code10 {
	public static int sumOfDigits(int num) {
		int sum=0;
		while (num > 0) {
			int rem = num % 10;
			num = num / 10;
			sum = sum + rem;
			
		}
		return sum;
	}

	public static void main(String[] args) {
         int sum=code10.sumOfDigits(111);
         System.out.println("the sum of digits is " +sum);
	}

}



