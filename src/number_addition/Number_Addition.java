/*
 * Using the Java language, have the function number_addition(str) take the str parameter, 
 * ...search for all the numbers in the string, add them together, then return that final number. 
 * 
 * For example: if str is "88Hello 3World!" the output should be 91. 
 * You will have to differentiate between single digit numbers and multiple digit numbers like in the example above. 
 * So "55Hello" and "5Hello 5" should return two different answers. Each string will contain at least one letter or symbol. 
 */




package number_addition;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class Number_Addition {
	
	
	
	public int number_addition(String str){
		
		int sum = 0;
		List <String> list = new ArrayList<>();
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()){
			list.add(matcher.group());
		}
		
		int temp = 0;
		for (int i = 0; i<list.size(); i++){

			temp = Integer.parseInt(list.get(i)); 
			sum += temp; 
		}
				
		return sum;
	}
 
	public static void main(String[] args) {
	    Scanner  s = new Scanner(System.in);
	    Number_Addition test = new Number_Addition();
	    System.out.println(test.number_addition(s.nextLine()));
	    s.close();

	}

}


/*What did I learn from this exercise?
 * 1. Integer i = new Integer(); is illegal. You must pass an int or a String into the constructor. 
*/
