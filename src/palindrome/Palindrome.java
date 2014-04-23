/*
 * Using the Java language, have the function palindrome(str) take the str parameter 
 * ...being passed and return the string true if the parameter is a palindrome, 
 * ...(the string is the same forward as it is backward) otherwise return the string false. 
 * 
 * For example: "racecar" is also "racecar" backwards. Punctuation and numbers will not be part of the string. 
 */

package palindrome;
import java.util.Scanner;

public class Palindrome {
 
    public String palindrome(String str){
    String reversed = "";
    
    for (int i = str.length()-1; i>=0; i--){
        reversed += str.charAt(i);
        }
    return new Boolean(str.equals(reversed)).toString();
    }
 
    //the main class will allow the user to type input into the console
    public static void main(String arg[]){
 
    Scanner s = new Scanner(System.in);
    Palindrome test = new Palindrome();
    System.out.println(test.palindrome(s.nextLine()));
    s.close();
    }
 
}