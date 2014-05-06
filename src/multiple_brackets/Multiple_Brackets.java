/*
 * Using the Java language, have the function MultipleBrackets(str) take the str parameter 
 * ...being passed and return 1 #ofBrackets if the brackets are correctly matched and each 
 * ...one is accounted for. Otherwise return 0. For example: if str is "(hello [world])(!)", 
 * ...then the output should be 1 3 because all the brackets are matched and there are 3 pairs of brackets, 
 * ...but if str is "((hello [world])" the the output should be 0 because the brackets do not correctly match up. 
 * ...Only "(", ")", "[", and "]" will be used as brackets. If str contains no brackets return 1. 
 * 
 * Use the Parameter Testing feature in the box below to test your code with different arguments.
 */

package multiple_brackets;

import java.util.*;

public class Multiple_Brackets {

	public int multiple_brackets(String str){

		//result is the overall result of the method
		//result_b is the square bracket portion of the method
		//result_p is the parentheses portion of the method
		int result = 0; 
		int result_b = 0; 
		int result_p = 0; 
		
		//This List<String> brackets stores the square brackets and parentheses in the input String.
		List <String> brackets = new ArrayList<>();
		List <String> parentheses = new ArrayList<>();
		//This is a counter for the number of opening brackets or parentheses
		int open_b = 0;
		int open_p = 0;
		//This is a counter for the number of closing brackets or parentheses
		int close_b = 0;
		int close_p = 0;
				
		
		
		for (int i = 0; i<str.length(); i++){
			if (str.substring(i, i+1).equals("[") || 
					str.substring(i, i+1).equals("]")){
				brackets.add(str.substring(i, i+1));
			}
		}
		
		if (brackets.isEmpty()){
			result_b = 1;
		}
		else if (brackets.size()%2 == 1){
			result_b = 0;
		}
		else {
			result_b = 1;
			for (int j = 0; j<brackets.size(); j++){
				if (brackets.get(j).equals("[")){
					open_b++;
				}
				if (brackets.get(j).equals("]")){
					close_b++;
				}
				if (close_b > open_b){
					result_b = 0;
					break;
				}	
			}
		}
		
		
		for (int j = 0; j<str.length(); j++){
			if (str.substring(j, j+1).equals("(") || 
					str.substring(j, j+1).equals(")")){
				parentheses.add(str.substring(j, j+1));
			}
		}
		
		if (brackets.isEmpty()){
			result_p = 1;
		}
		else if (brackets.size()%2 == 1){
			result_p = 0;
		}
		else {
			result_p = 1;
			for (int j = 0; j<brackets.size(); j++){
				if (brackets.get(j).equals("(")){
					open_p++;
				}
				if (brackets.get(j).equals(")")){
					close_p++;
				}
				if (close_p > open_p){
					result_p = 0;
					break;
				}	
			}
		}
		
		if (result_b == 1 && result_p ==1){
			result = 1;
		}
		else {
			result = 0;
		}
			
		return result;
	}
	
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    Multiple_Brackets test = new Multiple_Brackets();
	    System.out.println(test.multiple_brackets(s.nextLine()));
	    s.close();

	}

}
