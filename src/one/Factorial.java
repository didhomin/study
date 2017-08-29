package one;

public class Factorial {
	public static void main(String[] args) 
	       { 
	           System.out.println("result : " + factorial(5)); 
	       } 
	       
	       public static int factorial(int input) 
	       { 
	          if(input == 1) 
	          { 
	              return 1; 
	          } 
	           
	          return input * factorial(input-1); 
	      } 
}
