/*
 * Using the Java language, have the function Ex_Oh(str) take the str parameter 
 * ...being passed and return the string true if there is an equal number of x's and o's, 
 * ...otherwise return the string false. Only these two letters will be entered in the string, 
 * ...no punctuation or numbers. For example: if str is "xooxxxxooxo" then the output should
 * ...return false because there are 6 x's and 5 o's. 
 */

package ex_oh;
import java.util.*;

public class Ex_Oh {
	
	public String ex_oh(String str) {
		int num_x =0;
		int num_o =0;
		
		if (only_ox(str)){
			for (int i = 0; i<str.length(); i++){
				if ("Xx".indexOf(str.charAt(i)) != -1){
					num_x++;
				}
				else {
					num_o++;
				}
			}
			return new Boolean(num_x == num_o).toString();
		}
		else {
			return "Your input may only contain o's and x's.";
		}
	}

	//Creating a helper function to check if the input satisfies requirement.
	public static boolean only_ox(String str){
		int count = 0;
		for (int i = 0; i<str.length(); i++){
			if ("XxOo".indexOf(str.charAt(i)) != -1){
				count++;
			}
		}
		if (count == str.length()){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Ex_Oh test = new Ex_Oh();
		System.out.println(test.ex_oh(s.nextLine()));
		s.close();

	}

}
