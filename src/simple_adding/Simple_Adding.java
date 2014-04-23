/*
 * Using the Java language, have the function simple_adding(num) add up all the numbers from 1 to num. 
 * For the test cases, the parameter num will be any number from 1 to 1000. 
 */


package simple_adding;
import java.util.*;

public class Simple_Adding {
 
	int sum = 0;
	public int simple_adding(int num){
		if (num < 0 || num > 1000){
			System.out.println("Your input must be between 1 and 1000 inclusive.");	
			System.exit(0);
		}
		else {
			if (num == 1) {
				return 1;
			}
			else {
				return num += simple_adding(num-1);
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Simple_Adding test = new Simple_Adding();
		try {
		System.out.println(test.simple_adding(Integer.parseInt(s.nextLine())));
		}
		catch (NumberFormatException e){
			System.out.println("The input must be an integer");
		}		
		finally{
		s.close();			
		}
	}
}

/*What did I learn from this exercise?
 * 1. The return inside the recursion doesn't satisfy the requirement that a method must return something.
 * 2. However, if the method returns void, then the recursion cannot return a non-void output, which implies that the return statement
 * ...in the recursion counts for something! Strange.
 * 3. A Java method cannot return more than one type of value.
 * 
 * Remaining questions:
 * 1. Right now, if my input is out of range, the Console prints the error message and the input. 
 * ...What should I do to to make sure that if the error message is printed, then the input is not printed?
 * Answer: call System.exit(0); right after the System.out.println("....");.
*/ 



