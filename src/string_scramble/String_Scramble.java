/*
 * Using the Java language, have the function StringScramble(str1,str2) take both parameters 
 * ...being passed and return the string true if a portion of str1 characters can be rearranged 
 * ...to match str2, otherwise return the string false. For example: if str1 is "rkqodlw" and str2 
 * ...is "world" the output should return true. Punctuation and symbols will not be entered with the parameters. 
 */

package string_scramble;

import java.util.*;



public class String_Scramble {

	public String string_scramble(String str1, String str2){
		String result = "true";
		char[] str2_arr = str2.toCharArray();
		
		//If every char in str2 can be found in str1, then the function should return "true";
		for (char c : str2_arr){
			if(str1.indexOf(c) == -1){
				result = "false";
			}
		}
		return result;
		
	}


	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String_Scramble test = new String_Scramble();
		System.out.println(test.string_scramble(s.nextLine(), s.nextLine()));
		s.close();
	}

}
