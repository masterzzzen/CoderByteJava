package first_reverse;
import java.util.*; 
//import java.io.*;


/**
 * Using the Java language, have the function FirstReverse(str) take the str parameter being passed and 
 * return the string in reversed order. 
 * Use the Parameter Testing feature in the box below to test your code with different arguments.
 */

public class First_Reverse {  
	
	public String first_reverse(String str) {  
		String reversed_string = "";
		for (int i= str.length()-1; i<str.length(); i++){
			reversed_string += str.charAt(i);
		}
		return reversed_string;
    
  }      

  public static void main (String[] args) {  
   
    Scanner  s = new Scanner(System.in);
    First_Reverse test = new First_Reverse();
    System.out.print(test.first_reverse(s.nextLine())); 
    s.close();
    
  }
} 
