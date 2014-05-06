/*
 * For this challenge you will determine if the brackets in a string are correctly matched up.
 * Using the Java language, have the function BracketMatcher(str) take the str parameter being 
 * passed and return 1 if the brackets are correctly matched and each one is accounted for. 
 * Otherwise return 0. For example: if str is "(hello (world))", then the output should be 1, 
 * but if str is "((hello (world))" the the output should be 0 because the brackets do not correctly match up. 
 * Only "(" and ")" will be used as brackets. If str contains no brackets return 1. 
 * Use the Parameter Testing feature in the box below to test your code with different arguments.  
 */

package bracket_matcher;

import java.util.*;

public class Bracket_Matcher {

	public int bracket_matcher(String str){

		//Initialize result to 0 by default;
		int result = 0; 
		
		//This List<String> brackets stores the brackets in the input String.
		List <String> brackets = new ArrayList<>();
		//This is a counter for the number of opening brackets
		int open = 0;
		//This is a counter for the number of closing brackets
		int close = 0;
		
		for (int i = 0; i<str.length(); i++){
			if (str.substring(i, i+1).equals("(") || 
					str.substring(i, i+1).equals(")")){
				brackets.add(str.substring(i, i+1));
			}
		}
		
		if (brackets.isEmpty()){
			result = 1;
		}
		else if (brackets.size()%2 == 1){
			result = 0;
		}
		else {
			result = 1;
			for (int j = 0; j<brackets.size(); j++){
				if (brackets.get(j).equals("(")){
					open++;
				}
				if (brackets.get(j).equals(")")){
					close++;
				}
				if (close > open){
					result = 0;
					break;
				}	
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    Bracket_Matcher test = new Bracket_Matcher();
	    System.out.println(test.bracket_matcher(s.nextLine()));
	    s.close();

	}

}
