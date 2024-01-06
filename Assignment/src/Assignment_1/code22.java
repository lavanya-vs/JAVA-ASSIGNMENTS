package Assignment_1;

public class code22 {
	 public static boolean square(int num) {
	       for (int i = 1; i * i <= num; i++) {
	           if (i * i == num) {
	               return true;
	           }
	       }
	       return false;
	   }

public static void main(String[] args) {
  
    int num = 100;

    if (square(num)) {
        System.out.println(num + "  perfect square");
    } else {
        System.out.println(num + "  not a perfect square");
    }
}


}

	



