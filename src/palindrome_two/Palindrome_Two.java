/*
 * Using the Java language, have the function palindrome_two(str) take the str parameter 
 * being passed and return the string true if the parameter is a palindrome, 
 * (the string is the same forward as it is backward) otherwise return the string false. 
 * 
 * The parameter entered may have punctuation and symbols but they should not affect whether 
 * ...the string is in fact a palindrome. For example: "Anne, I vote more cars race Rome-to-Vienna" should return true. 
 * 
 */

package palindrome_two;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Palindrome_Two {


	
	public boolean palindrome_two(String str){
		
		//Create a list of words found in the sentence
		List <String> word = new ArrayList<String>();
		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()){
			word.add(matcher.group());
		}
		 
		//This section of code creates a String devoid of non-word characters.
		String condensed = "";
		for (String s : word){
			condensed += s; 
		}
		
		//Create a List of Character which we will iterate through
		List <Character> palindrome = new LinkedList<Character>();
		char[] array = condensed.toCharArray();
		System.out.println("array is: " + Arrays.toString(array));
		for (int i = 0; i<array.length; i++){
			palindrome.add(array[i]);
		}
		 
		ListIterator<Character> iterator = palindrome.listIterator();
		ListIterator<Character> revIterator = palindrome.listIterator (palindrome.size());
		
		boolean result = true;
		while(revIterator.hasPrevious() && iterator.hasNext()){
			if(iterator.next() != revIterator.previous()){
				result = false;
				break;
			}
		}
		
		if (result){
			return true;
		}
		else {
			return false;
		}
			

	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Palindrome_Two test = new Palindrome_Two();	
		System.out.println(test.palindrome_two(s.nextLine()));
		s.close();

	}

}
