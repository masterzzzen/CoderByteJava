/*
 * Using the Java language, have the function FibonacciChecker(num) return the string yes if the 
 * ...number given is part of the Fibonacci sequence. This sequence is defined by: Fn = Fn-1 + Fn-2, 
 * ...which means to find Fn you add the previous two numbers up. The first two numbers are 0 and 1, 
 * ...then comes 1, 2, 3, 5 etc. If num is not in the Fibonacci sequence, return the string no. 
 * 
 * Use the Parameter Testing feature in the box below to test your code with different arguments.
 */

package fibonacci_checker;

import java.util.Scanner;
import java.util.*;

public class Fibonacci_Checker {

	public String fibonacci_checker(int n){
		String result = "No.";
		List <Integer> list = new ArrayList<>();
		
		//To check if n is in the Fibonacci sequence, we check if it's in the Fibonacci sequence of size n+1.  
		//"n+1 because in small cases such as n <= 3; using "n" would return No.
		for (int i = 0; i<n+1; i++){
			list.add(fib(i+1));
		}
	
		if (list.indexOf(n) > -1){
			result = "Yes.";
		}
		System.out.println(list);
		return result;
	}
		
	
	public int fib(int n){
		if (n<=1){
			return n;
		}
		else {
			return fib(n-1) + fib(n-2) ;
		}
	}
	
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    Fibonacci_Checker test = new Fibonacci_Checker();
	    System.out.println(test.fibonacci_checker(Integer.parseInt(s.nextLine())));
	    s.close();

	}

}
