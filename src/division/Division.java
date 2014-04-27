/*
 * Using the Java language, have the function Division(num1,num2) take both parameters 
 * ...being passed and return the Greatest Common Factor. That is, return the greatest 
 * ...number that evenly goes into both numbers with no remainder. For example: 12 and 16 
 * ...both are divisible by 1, 2, and 4 so the output should be 4. 
 * 
 * The range for both parameters will be from 1 to 10^3. 

 */


package division;

import java.util.Scanner;
import java.util.*;

public class Division {

	public int division (int num1, int num2){
		
		//Incrementer
		int n = 1;
		List<Integer> divs = new ArrayList<>();
		while (n<=num1 && n<=num2){
			if ((double) (num1/n) == (double) num1 / (double) n 
					&& (double) (num2/n) == (double) num2 / (double) n){
				divs.add(n);
			}
			n++;
		}
		return divs.get(divs.size()-1);
		
		
		
	}
	public static void main(String[] args) {

	    Scanner  s = new Scanner(System.in);
	    Division test = new Division();
	    System.out.println(test.division(Integer.parseInt(s.nextLine()), Integer.parseInt(s.nextLine())));
	    s.close();
	}

}
