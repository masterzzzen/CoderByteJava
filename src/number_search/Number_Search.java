/*
 * Using the Java language, have the function NumberSearch(str) take the str parameter, 
 * ...search for all the numbers in the string, add them together, then return that final 
 * ...number divided by the total amount of letters in the string. For example: if str is 
 * ..."Hello6 9World 2, Nic8e D7ay!" the output should be 2. First if you add up all the numbers, 
 * ...6 + 9 + 2 + 8 + 7 you get 32. Then there are 17 letters in the string. 32 / 17 = 1.882, and 
 * ...the final answer should be rounded to the nearest whole number, so the answer is 2. Only 
 * ...single digit numbers separated by spaces will be used throughout the whole string 
 * 
 * (So this won't ever be the case: hello44444 world). Each string will also have at least one letter. 
 */


package number_search;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Number_Search {

	public double number_search(String str){
		//Create an empty ArrayList <String> to store the words in the String.
		ArrayList <String> word_list = new ArrayList<>();
		
		//Use regular expression to find all of the words in the sentence.
		Pattern pattern_str = Pattern.compile("\\w+");
		Matcher matcher_str = pattern_str.matcher(str);
		
		//Store the words to the word_list.
		while(matcher_str.find()){
			word_list.add(matcher_str.group());
		};
		
		//System.out.println(word_list);
		
		//Create an empty ArrayList <String> to store the words in the String.
		ArrayList <String> num_list = new ArrayList<>();
		
		
		//Use regular expression to find all of the words in the sentence.
		Pattern pattern_num = Pattern.compile("\\d+");
		Matcher matcher_num = pattern_num.matcher(str);
		
		//Store the words to the word_list.
		while(matcher_num.find()){
			num_list.add(matcher_num.group());
		};
		
		//System.out.println(num_list);
		
		//Calculate the sum of all digits
		String digits = "";
		for (String num : num_list){
			digits += num;
		}
		int sum = 0;
		for (int i = 0; i<digits.length()-1; i++){
			sum += Integer.parseInt(digits.substring(i,i+1));
		}
		//System.out.println("digits is: " + digits);
		//System.out.println("sum is: " + sum);
		
		//Calculate the number of letter
		String all = "";
		for (String word : word_list){
			all += word;
		}
		//System.out.println("all is: " + all);
		
		int letter_count = all.length() - digits.length();
		//System.out.println("letter_count is: " + letter_count);
		
		double result = (double) sum / (double) letter_count;
		
		return result;

	}
	
	public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);
	    Number_Search test = new Number_Search();
	    System.out.println(test.number_search(s.nextLine()));
	    s.close();
	}

}
