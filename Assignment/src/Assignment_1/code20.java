package Assignment_1;

public class code20 {
	 public static boolean Strong (int num)
	  {
	    int number;
	    int sum = 0;
	    int ree = num;
	    while(ree!=0){
	        number = ree % 10;
	        
	        sum = sum + fact(number);
	        ree /= 10;
	    }
	    
	    return sum == num;
	  }
	 
	 public static int fact (int num)
	  {
	     if(num == 0)
	        return 1;
	        
	    return num * fact(num-1);
	  }

public static void main (String[]args)
{
int num = 145;
if (Strong (num))
    System.out.println (num + "  strong number");
else
    System.out.println (num + "  not strong number");
}
}




