/*
 * Using the Java language, have the function word_count(str) take the str string parameter 
 * ...being passed and return the number of words the string contains 
 * ...(ie. "Never eat shredded wheat" would return 4). 
 * 
 * Words will be separated by single spaces. 
 */

package word_count;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Word_Count {

	
	public int word_count(String str){
		ArrayList <String> word_list = new ArrayList<>();
		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(str);
		
		while (matcher.find()){
			word_list.add(matcher.group());
		}
		return word_list.size();
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Word_Count test = new Word_Count();
		System.out.println(test.word_count(s.nextLine()));
		s.close();
		

	}

}

/*What did I learn from this exercise?
 * 1. import java.util.*; does not actually import java.util.regex.Matcher or java.util.regex.Pattern.
*/
