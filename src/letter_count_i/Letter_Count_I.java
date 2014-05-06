/*
 * Using the Java language, have the function letter_count_i(str) take the str parameter 
 *...being passed and return the first word with the greatest number of repeated letters. 
 *
 * For example: "Today, is the greatest day ever!" should return greatest because it has 2 e's (and 2 t's) 
 * ...and it comes before ever which also has 2 e's. 
 */


package letter_count_i;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class Letter_Count_I {

	public String letter_count_i(String str){
		List <String> word_list = get_words(str);
		List <Integer> count_list = new ArrayList<>();
		for (String s : word_list){
			count_list.add(count_max(s));
		}
		Integer max = Collections.max(count_list);
		System.out.println("Max is: " + max);
		Integer index_of_max = count_list.indexOf(max);
		System.out.println("Index of max is: " + index_of_max);
		String result = word_list.get(index_of_max);
		return result;
		
	}
	
	//This helper function converts the String input into an ArrayList of words.
	public List<String> get_words(String str){
		
		//List <List<String>> table = new ArrayList<>();
		
		List<String> words = new ArrayList<>();
		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(str);
		
		while (matcher.find()){
			words.add(matcher.group());
		}
		
		return words;
		//String condensed = condense(words);
		//System.out.println("The condensed String of words is: " + condensed);
		
		/*
		for (int i1 = 0; i1<
				
				: condensed.toCharArray()){
			table.get()
		}
		*/
		//return word_list;
		
	}
	
	public Integer get_count (String word, List<String> list){
		Integer c = 0;
		for (String s : list){
			if (word == s){
				c++;
			}
		}
		return c;
	}
	
	//This helper function returns the number of occurrences for the most frequently appearing letter in a String;
	public int count_max (String str){
		
		List<Character> list = new ArrayList<>();
		List<Integer> repeats = new ArrayList<>();
		for (Character ch : str.toCharArray()){
			list.add(ch);
		}
		
		for (int i = 0; i<str.length(); i++){
			int n = 0;
			for (int j = 0; j<list.size(); j++){
				if (list.get(j) == str.toCharArray()[i]){
					n++;
				}
			}
			repeats.add(n);
		}
		return Collections.max(repeats);
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Letter_Count_I test = new Letter_Count_I();
		System.out.println(test.letter_count_i(s.nextLine()));
		s.close();

	}

}
