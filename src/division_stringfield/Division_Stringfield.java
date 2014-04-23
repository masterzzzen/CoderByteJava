/*
 * Using the Java language, have the function division_stringified(num1,num2) take both parameters 
 * ...being passed, divide num1 by num2, and return the result as a string with properly formatted commas. 
 * 
 * If an answer is only 3 digits long, return the number with no commas (ie. 2 / 3 should output "1"). 
 * For example: if num1 is 123456789 and num2 is 10000 the output should be "12,346". 
 */
package division_stringfield;
import java.lang.Math;
import java.util.Scanner;



public class Division_Stringfield {

	public String division_stringfield(double num1, double num2){

		int new_num =  (int) Math.round(num1/num2);
		StringBuilder str = new StringBuilder(new Integer(new_num).toString());
		
		for (int i = str.length()-1; i>0; ){
			i -= 3;
			str.insert(i+1, ",");
		}

		return str.toString();
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Division_Stringfield test = new Division_Stringfield();
		System.out.println(test.division_stringfield(Double.parseDouble(s.nextLine()),Double.parseDouble(s.nextLine())));
		s.close();

	}

}

/*What did I learn from this exercise?
 * 1. There is the java.math package and then there is the java.lang.Math class.
 * 2. java.lang.Math.round(double a) returns long as in public static long round(double a).
 * 3. After import java.lang.Math; to call the round(...) method, you still need to call Math.round(...); not simply round(...).
 * 4. To convert from double to int requires explicit casting.
 * 5. Yes, you can println(StringBuilder s);
 * 6. StringBuilder also has the length() method.
 * 7. To convert from StringBuilder to String, simply call toString();
*/
