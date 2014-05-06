/*
 * Using the Java language, have the function CaesarCipher(str,num) take the str parameter 
 * ...and perform a Caesar Cipher shift on it using the num parameter as the shifting number. 
 * 
 * A Caesar Cipher works by shifting each letter in the string N places down in the alphabet (in this case N will be num). 
 * ...Punctuation, spaces, and capitalization should remain intact. For example if the string is "Caesar Cipher" and num is 2 
 * ...the output should be "Ecguct Ekrjgt".
 */


package caesar_cipher;

import java.util.Scanner;


public class Caesar_Cipher {
	
	static final String C = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static final String L = "abcdefghijklmnopqrstuvwxyz";
	
	public String caesar_cipher(String str, int num){
		 
		String result = "";
	
		for (int i = 0; i<str.length(); i++){
			if (C.indexOf(str.charAt(i))!=-1){
				result += C.charAt((C.indexOf(str.charAt(i))+num)%26);
			}
			else if (L.indexOf(str.charAt(i))!=-1){
				result += L.charAt((L.indexOf(str.charAt(i))+num)%26);
			}
			else {
				result += str.charAt(i);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Caesar_Cipher test = new Caesar_Cipher();
	    System.out.print(test.caesar_cipher(s.nextLine(), Integer.parseInt(s.nextLine()))); 
	    s.close();
	}
}
