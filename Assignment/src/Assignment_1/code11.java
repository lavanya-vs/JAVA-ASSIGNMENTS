package Assignment_1;

public class code11 {
	public static void reverse() {
		int num = 321;
		int rev = 0;  
		
		while(num != 0)   
		{  
		int rem = num % 10;  
		rev = rev * 10 + rem;  
		num = num/10;  
		}  
		System.out.println(" reverse is=  " + rev);  
		} 
	

	public static void main(String[] args) {
		{  
			code11 ol=new code11();
			ol.reverse();
	}
	
}
}





