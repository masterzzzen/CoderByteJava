/* Using the Java language, have the function longest_word(sentence) take the sentence parameter 
 * ...being passed and return the largest word in the string. 
 * 
 * If there are two or more words that are the same length, return the first word from the string with that length. 
 * 
 * Ignore punctuation and assume sentence will not be empty. 
*/

package longest_word;
import java.util.*; 
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Longest_Word {

	public String longest_word(String sentence) { 
		  
		    // code goes here   
		    /* Note: In Java the return type of a function and the 
		     * parameter types being passed are defined, so this return 
		     * call must match the return type of the function.
		     * You are free to modify the return type. 
		    */
		
		//Create an empty ArrayList <String> to store the words in the sentence.
		ArrayList <String> word_list = new ArrayList<String>();
		
		//Use regular expression to find all of the words in the sentence.
		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(sentence);
		
		//Store the words to the word_list.
		while(matcher.find()){
			word_list.add(matcher.group());
		}

		//Create an empty ArrayList <Integer> to store the lengths of each word.
		ArrayList <Integer> word_lengths = new ArrayList<>(); 
		
		//Add the lengths to word_lengths.
		for (String word : word_list){
			word_lengths.add(word.length());
		}
		
		//Find the longest word by its index in the word_list, and then print it to the console.
		String longest_word = word_list.get(word_lengths.indexOf(getMax(word_lengths)));
		return longest_word;
	}	
	
	//Implement a method to find the biggest Integer in an ArrayList <Integer>.
	public int getMax(ArrayList<Integer> list){
		int max = Integer.MIN_VALUE;
		for(int i=0; i<list.size(); i++){
			if(list.get(i) > max){
				max = list.get(i);
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
	    Scanner  s = new Scanner(System.in);
	    Longest_Word test = new Longest_Word();
	    System.out.println(test.longest_word(s.nextLine()));
	    s.close();

	}

}

/*What did I learn from this exercise?
 * 1. ArrayList doesn't have the append() method; use add() instead.
 * 2. Regular expression "\\w+" matches everything that's a word character.
 * 3. ArrayList doesn't have a method that returns the largest or smallest item; you need to write your own method for that.
 * 4. Array is too impractical because you cannot manipulate it and its length cannot change after being initialized.
 * 5. You cannot get the i-th item in an ArrayList by calling arrayList[i]; use the get() method instead. 
 * 6. Array has the append() method. String has the + concatenation operator. And ArrayList has the add() method.
*/







