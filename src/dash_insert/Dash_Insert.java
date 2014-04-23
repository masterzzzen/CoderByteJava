/*
 * Using the Java language, have the function dash_insert(String) insert dashes ('-') 
 * ...before each odd number. 
 * between each two odd numbers in num. For example: if num is 454793 the output should be 4547-9-3. 
 * ...Don't count zero as an odd number. 
 */


package dash_insert;

import java.util.Scanner;
//import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Dash_Insert {

	public String dash_insert(String num){
		
		//First, convert the input String number into an array of ints, 
		//...which is necessary for performing the operation to check if a digit is an odd number.
		ArrayList <Integer> array = new ArrayList<>();
		for (int i = 0; i<num.length(); i++){
			array.add(Integer.parseInt(num.substring(i, i+1)));
		}
		System.out.println(array.toString());
		
		
		//Also, make a List of Strings which is necessary for when inserting "-" at the positions of odd numbers
		//...because the add(int index, T object) method takes an object of type T consistent with the type T of the ArrayList or List. 
		List <String> str_array = new ArrayList<>();
		for (int i = 0; i<num.length(); i++){
			str_array.add(num.substring(i, i+1));
		}
		System.out.println(str_array);
		
		//Find the positions of odd numbers in this array. 
		List <Integer> positions = new ArrayList<>();
		for (int i = 0; i<array.size(); i++){
			if (array.get(i) % 2 == 1){
				positions.add(i);
			}
		}
		System.out.println(positions);
		
		/*
		//Convert the List positions into an array such that the code used later for accessing the ints in the list is cleaner.
		Integer [] p = positions.toArray(new Integer[positions.size()]);		
		int[] pos = new int[p.length]; 
		for (int i = 0; i<pos.length; i++){
			pos[i] = p[i].intValue();
		}
		*/
		
		//Now, insert a dash in the position of odd numbers 
		int count = 0; 
		for (Integer i : positions){
			str_array.add(i.intValue()+count, "-");
			count++;
		}
		System.out.println(str_array);
		
		/*

		int[]b = a;
		Integer aa = new Integer(1);
		int bb = aa; 
				 * 
		 */		
		// = new Integer(num).tointArray();	
		
		
		//return str_array.toString();
		
		
		return "";
	}
	
	public static void main(String[] args) {

	    Scanner  s = new Scanner(System.in);
	    Dash_Insert test = new Dash_Insert();
	    System.out.println(test.dash_insert(s.nextLine()));
	    s.close();
	}
}


/*What did I learn from this exercise?
 * 1. int = Integer is allowed, but int[] = Integer[] is not allowed.
 * 2. Java should have a native method for converting Integer[] to int[] and vice versa. 
*/
