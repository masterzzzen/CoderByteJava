/*
 * For this challenge you will be determining the multiples of a specific number. 
 * ...Using the Java language, have the function ThreeFiveMultiples(num) return the 
 * ...sum of all the multiples of 3 and 5 that are below num. For example: if num is 10, 
 * ...the multiples of 3 and 5 that are below 10 are 3, 5, 6, and 9, and adding them up 
 * ...you get 23, so your program should return 23. The integer being passed will be between 1 and 100. 
 * Use the Parameter Testing feature in the box below to test your code with different arguments.
 */

package threefive_multiples;

import java.util.*;


public class ThreeFive_Multiples {

	public int threefive_multiples(int num){
		int sum = 0;
		
		//Find the number of 3s and 5s
		int count3s = (num - num%3)/3;
		//System.out.println("count3s is: " + count3s);
		int count5s = (num - num%5)/5;
		//System.out.println("count5s is: " + count5s);
		
		//Find the sums of all 3s and of all 5s
		int sum3 = (3+ (num - num%3))*count3s/2; 
		//System.out.println("sum3 is: " + sum3);
		int sum5 = (5+ (num - num%5))*count5s/2; 
		//System.out.println("sum5 is: " + sum5);
		
		sum = sum3 + sum5;
		return sum;
	}

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    ThreeFive_Multiples test = new ThreeFive_Multiples();
	    System.out.println(test.threefive_multiples(Integer.parseInt(s.nextLine())));
	    s.close();
	}

}
