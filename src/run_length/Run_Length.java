/*
 * Using the Java language, have the function run_length(str) take the str 
 * ...parameter being passed and return a compressed version of the string using the 
 * ...Run-length encoding algorithm. This algorithm works by taking the occurrence of 
 * ...each repeating character and outputting that number along with a single character of the repeating sequence. 
 * 
 * For example: "wwwggopp" would return 3w2g1o2p. The string will not contain any numbers, punctuation, or symbols. 
 */


package run_length;

import java.util.Scanner;
import java.util.*;

/*
class Pair<T1, T2> {
	private T1 count;
	private T2 letter;
	public Pair(){
		super();
	}
	public Pair(T1 c, T2 l){
		count = c;
		letter = l;
	}
	public T1 getCount(){
		return count;
	}
	public T2 getLetter(){
		return letter;
	}
}
*/

public class Run_Length {
	
	public String run_length(String str){
		String result = "";
		//Create a set of key-value pairs where the key is the letter and the value is the count of that letter.
		Map<Character, Integer> pairs = new HashMap<Character, Integer>();
		char[] input = str.toCharArray();
		
		//Remove duplicates 
		List <Character> input2 = new ArrayList<>();
		for (Character c : input ) {
			if (!input2.contains(c)){
				input2.add(c);
			}
		}
		
		//Adding key-value pairs to pairs.
		for (Character c : input2){
			pairs.put(c, count(c, input));
		}		
		
		//For every Character c in the Set input2, concatenate it and its count to the String result.
		for ( Character c : input2){
			if(pairs.containsKey(c)){
				result += pairs.get(c) + c.toString();
			}
		}
		return result;
	}
	

	public int count (char c, char[] arr){
		int result = 0;
		for (int i = 0; i<arr.length; i++){
			if (arr[i]==c){
				result++;
			}
		}
		return result;
	}

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Run_Length test = new Run_Length();	
		System.out.println(test.run_length(s.nextLine()));
		s.close();
	}
}

/*What did I learn from this exercise?
 * 1. Set<T> takes one parameter
 * 2. HashSet removes duplicates but is unsorted, and the order is random.
 * 3. TreeSet removes duplicates and is sorted
 * 4. Map<T1, T2> takes 2 parameters
 * 5. HashMap is unsorted, but does not remove duplicates. And its order is random.
 * 6. TreeMap is sorted, but does not remove duplicates.
*/













