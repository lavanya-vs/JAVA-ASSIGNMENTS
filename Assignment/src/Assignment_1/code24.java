package Assignment_1;

public class code24 {
	public static void main(String[] args) {
		int n = 121;
		int sum = 0;
		for (int i = 1; i < n; i++) {
		if (n % i == 0)
		sum = sum + i;
		}
		if (sum > n) {
		System.out.println(n + " abundant number");
		
		}
		else
		System.out.println(n + "  not  abundant number");
		}
}

