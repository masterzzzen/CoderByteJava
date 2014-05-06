package string_reduction;

import java.util.Scanner;
import java.util.*;

public class String_Reduction {

	public String string_reduction(String str){
		String result = "";
		Deque <String> letters = new ArrayDeque<>();
		for (int i = 0; i<str.length(); i++){
			if (!letters.isEmpty()){
				if (!letters.peekLast().equals(str.substring(i,i+1))){
					String temp = letters.pollLast();
					System.out.println("temp is: " + temp);
					System.out.println("the next letter up is: " +str.substring(i,i+1));
					System.out.println("letters are: " + letters);
					letters.offerLast(reduce(temp, str.substring(i,i+1)));
					System.out.println("the end of the deque after reduce() is: " + letters.peekLast());
					System.out.println("letters are: " + letters);
				}
				else {
					System.out.println("the end of the deque before adding the same letter is: " + letters.peekLast());
					letters.push(str.substring(i,i+1));
					System.out.println("the end of the deque after adding the same letter is: " + letters.peekLast());
				}
			}
			letters.push(str.substring(i,i+1));
			System.out.println("letters are: " + letters);
		}		
		
		//This turns the Deque into a String
		for (int j = 0; j < letters.size(); j++){
			result += letters.removeFirst();
		}
		return result;
	}
	
	
	public String reduce(String str1, String str2){
		String result = "";
		if ((str1+str2).equals("ab") || (str1+str2).equals("ba")){
			result = "c"; 
		}
		if ((str1+str2).equals("bc") || (str1+str2).equals("cb")){
			result = "a"; 
		}		
		if ((str1+str2).equals("ac") || (str1+str2).equals("ca")){
			result = "b"; 
		}		
		
		return result;
	}
	
	
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    String_Reduction test = new String_Reduction();
	    System.out.println(test.string_reduction(s.nextLine()));
	    s.close();

	}

}
