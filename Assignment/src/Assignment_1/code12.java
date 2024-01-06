package Assignment_1;

public class code12 {
	public static void reverse()
	{
		int num = 12321;
		int rev = 0;  
		 int onum = num;
		while(num != 0)   
		{  
		int rem = num % 10;  
		rev = rev * 10 + rem;  
		num = num/10;  
		}  
		System.out.println(" reverse is=  " + rev);  
		

		if(onum==rev) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("not pallindrome");
			
		}
	}
	

	public static void main(String[] args) {
		code12 pp =new code12() ;
		pp.reverse();
		
		
	}

}




