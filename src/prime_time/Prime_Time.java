/*
 * Using the Java language, have the function prime_time(num) take the num parameter 
 * ...being passed and return the string true if the parameter is a prime number, 
 * ...otherwise return the string false. The range will be between 1 and 2^16. 
 */


package prime_time;

import java.util.Scanner;
import java.lang.Math;
import java.util.List;
import java.util.ArrayList;


public class Prime_Time {

	List<Double> quotients = new ArrayList<>();
	public String prime_time(int num){
		quotients = new ArrayList<>();
		double temp = 0.0;

		if (1<= num && num <= Math.pow(2.0, 16.0)){

			for (int i = num; i >= 2; i--) {
				
				temp = (double) num/ (double) i;
				if (temp == (double) (num/i)){
					quotients.add(temp);
				}
			}
			
			if (quotients.size()<2){
				return "true";
			}
			else{
				return "false";
			}
			
		}
		
		else{
			return "Your input is out of range.";
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Prime_Time test = new Prime_Time();
		System.out.println("Please enter an integer between 1 and 2^16 inclusive.");
		System.out.println(test.prime_time((Integer.parseInt(s.nextLine()))));
		s.close();

	}

}
