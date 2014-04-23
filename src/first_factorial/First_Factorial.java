package first_factorial;

import java.util.*; 
//import java.io.*;

/**
 * Using the Java language, have the function first_factorial(num) take the num parameter 
 * ...being passed and return the factorial of it (ie. if num = 4, return (4 * 3 * 2 * 1)). 
 * For the test cases, the range will be between 1 and 18. 
 * 
 * Use the Parameter Testing feature in the box below to test your code with different arguments.

 */


public class First_Factorial {  
	
	public int first_factorial(int num) { 
		if (num >= 1 && num <= 18){
			if (num == 0 || num == 1){
				return 1; 
			}
			else {
				return num *= first_factorial(num-1);
			}
		}
		else {
			System.out.println("Your input can only be between 1 and 18 inclusive.");
			return num;
		}

	}	      

	public static void main (String[] args) {  
   
		Scanner s = new Scanner(System.in);
	    int input = Integer.parseInt(s.nextLine());
	    First_Factorial test = new First_Factorial();
	    System.out.print(test.first_factorial(input));  
	    s.close();
    }
} 
