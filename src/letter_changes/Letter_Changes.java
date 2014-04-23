/*
 * Using the Java language, have the function letter_changes(str) take the str parameter 
 * ...being passed and modify it using the following algorithm. 
 * 
 * Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a). 
 * 
 * Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string. 
 */


package letter_changes;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Letter_Changes {

	List <Character> alphabet_cap = Arrays.asList('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');
	List <Character> alphabet_low = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
	List <Character> vowels_low = Arrays.asList('a', 'e', 'i', 'o', 'u');
	List <Character> vowels_cap = Arrays.asList('A', 'E', 'I', 'O', 'U');	
	
	//Another implementation is to store "ABC...XYZ", "abc...xyz", "ae...u", "AE..U" as 4 Strings.
	
	public String letter_changes(String str){
		char[] characters = str.toCharArray();
		String new_string = "";
		
		//Because we want to operate on word characters and leave non-word characters alone, we need to check if a character is a word character.
		//Part 1: Instantiate a Patter() object outside of the for loop, such that only one Patter() object is created.
		//...which saves a potentially large amount of object overhead.
		Pattern pattern = Pattern.compile("\\w+");
		
		for (int i = 0; i<characters.length; i++){
			//Part 2: The Matcher() object(s) must be put inside the for loop because we need the incrementer i.
			Matcher matcher = pattern.matcher(new Character(characters[i]).toString());
			//Part 3: Check if a character is a word character.
			if (matcher.find()){
				//Because Java sees "0", "1"...,"9" as word characters, we need to make sure that we need to check for digits 
				//...and make sure that digits are carried over to new_string intact.
				if (isDigit(characters[i])){
					new_string += characters[i];
				}
				else if (Character.isUpperCase(characters[i])){
					new_string += alphabet_cap.get((alphabet_cap.indexOf(characters[i])+1)%26);}
				else {
					new_string += alphabet_low.get((alphabet_low.indexOf(characters[i])+1)%26);}	
				}
			else {
				new_string += characters[i];
			}
		}
		
		String string_w_caps ="";
		char[] array = new_string.toCharArray();
		
		for (int i = 0; i<new_string.length(); i++){
			if (isVowel(array[i])){
				string_w_caps += new Character(array[i]).toString().toUpperCase();
			}
			else
				string_w_caps += array[i];
		}
		return string_w_caps; 	
	}

	//Method for checking if a character is a vowel.
	public static boolean isVowel(char c) {
		  return "AEIOUaeiou".indexOf(c) != -1;
		}
	
	//Method for checking if a character is a digit.
	public static boolean isDigit(char c){
		return "0123456789".indexOf(c) != -1;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Letter_Changes test = new Letter_Changes();
		System.out.println(test.letter_changes(s.nextLine()));
		s.close();
	}

}


/*What did I learn from this exercise?
 * 1. You cannot call str[i] to get the i-th character of a String. Use the charAt() method instead.
 * 2. An array does not have an indexOf() method. Only String has it. And this is appalling. 
 * 3. You cannot add elements to an ArrayList by simply calling {'a', 'b', 'c'}.
 * 4. The Array class has a static Array.asList() method that turns the Array into a List backed by the specific Array.
 * 5. In "0123456789".indexOf(c), no explicit loop is needed. 
*/
