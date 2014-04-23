/*
 * Using the Java language, have the function letter_capitalize(str) take the str parameter 
 * ...being passed and capitalize the first letter of each word. 
 * Words will be separated by only one space. 
 */


package letter_capitalize;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Letter_Capitalize {

	ArrayList<String> word_list = new ArrayList<>();
	ArrayList<String> cap_list = new ArrayList<>();
	String cap ="";
	
	public ArrayList<String> letter_capitalize(String str){
		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()){
			word_list.add(matcher.group());
		}

		for (String s : word_list){
			cap = s.substring(0,1).toUpperCase() + s.substring(1);
			cap_list.add(cap);
		}
		return cap_list;
	}	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Letter_Capitalize test = new Letter_Capitalize();
		System.out.println(test.letter_capitalize(s.nextLine()));
		s.close();
	}

}
