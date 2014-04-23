package alphabet_soup;

/*
 * Using the Java language, have the function alphabet_soup(str) take the str string parameter 
 * ...being passed and return the string with the letters in alphabetical order (ie. hello becomes ehllo). 
 * 
 * Assume numbers and punctuation symbols will not be included in the string. 
 */



import java.util.Arrays;
import java.util.Scanner;

public class Alphabet_Soup {

	public String alphabet_soup(String str){
		String new_string = "";
		char[] array = str.toCharArray();
		Arrays.sort(array);
		for (int i = 0; i<array.length; i++){
			new_string += array[i];			
		}
		return new_string;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Alphabet_Soup test = new Alphabet_Soup();
		System.out.println(test.alphabet_soup(s.nextLine()));
		s.close();

	}

}


/*What did I learn from this exercise?
 * 1. Arrays.sort(array); actually changes the array permanently. 
 * 2. Arrays.toString(); actually presents each element in the array as such [element1, element2...]
 * 3. A for-each loop such as below can also cause ArrayIndexOutOfBoundsException.
 * 
 * 	public String alphabet_soup(String str){
		String new_string = "";
		char[] array = str.toCharArray();
		Arrays.sort(array);
		for (char i : array){
			new_string += array[i];			
		}
		return new_string;
	}
 *
 *	
*/


