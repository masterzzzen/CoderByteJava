/*
 * Using the Java language, have the function SwapCase(str) take the str parameter and 
 * ...swap the case of each character. For example: if str is "Hello World" the output should be hELLO wORLD. 
 * Let numbers and symbols stay the way they are. 
 */


package swap_case;

import java.util.Scanner;

public class Swap_Case {
	String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String lower = "abcdefghijklmnopqrstuvwxyz";

	public String swap_case(String str){

		char [] string = str.toCharArray();
		String new_string = "";
		
		for (int i = 0; i<string.length; i++){
			string[i] = switch_char(str.charAt(i));
			new_string += string[i];
		}
		return new_string;
	}
	
	
	//This helper function checks the case of the char
	//...and returns 
	public char switch_char (char c){
		char result = ' ';
		if (upper.indexOf(c) != -1){
			result = lower.charAt(upper.indexOf(c));
		}
		else if (lower.indexOf(c) != -1){
			result = upper.charAt(lower.indexOf(c));
		}
		else{
			result = c;
		}
	 	return result;
	}

	
	public static void main(String[] args) {

	    Scanner  s = new Scanner(System.in);
	    Swap_Case test = new Swap_Case();
	    System.out.println(test.swap_case(s.nextLine()));
	    s.close();

	}

}

/*What did I learn from this exercise?
 * 1. '' is legal. You must put at least one space inside the single quotes.
 * 2. String.replace(oldChar, newChar) replaces all occurrences of the old character.
*/
