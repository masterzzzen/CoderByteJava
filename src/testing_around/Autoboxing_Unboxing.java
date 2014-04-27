/*
 * In this program, I wanted to test to see at what time int gets upgraded to double 
 */

package testing_around;

import java.util.Scanner;


public class Autoboxing_Unboxing {

	
	
	Integer i = new Integer(10);
	int a = 10; 
	int result =i/a;
	int result2 = a/i; 
	
	public void ab (){
			
			
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Autoboxing_Unboxing test = new Autoboxing_Unboxing();
		System.out.println(test.result);
		System.out.println(test.result2);
		s.close();

	}

}

/*What did I learn from this exercise?
 * 1. Integer/ int is allowed.
*/
