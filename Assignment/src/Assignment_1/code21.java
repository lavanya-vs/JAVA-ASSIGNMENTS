package Assignment_1;

public class code21 {
	  
    public static boolean perfect(int num) {
        int sum = 0;
        
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        return sum == num;
    }
    
    public static void main(String[] args) {
        int num = 6; 
        
        if (perfect(num)) {
            System.out.println(num + "  perfect number");
        } else {
            System.out.println(num + "  not a perfect number");
        }
    }
}







