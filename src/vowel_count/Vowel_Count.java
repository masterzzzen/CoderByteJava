/*
 * Using the Java language, have the function vowel_count(str) take the str string parameter 
 * ...being passed and return the number of vowels the string contains (ie. "All cows eat grass" would return 5). 
 * Do not count y as a vowel for this challenge. 
 */

package vowel_count;

import java.util.Scanner;

public class Vowel_Count {


	
	public int vowel_count(String str){
		
		String vowels = "AEIOUaeiou";
		int count = 0;

		for (int i = 0; i<str.length(); i++){
			if (vowels.indexOf(str.charAt(i))!=-1){
				count++;
			}
		}
	return count;		
	}

	public static void main(String[] args) {
	    Scanner  s = new Scanner(System.in);
	    Vowel_Count test = new Vowel_Count();
	    System.out.println(test.vowel_count(s.nextLine()));
	    s.close();

	}

}
