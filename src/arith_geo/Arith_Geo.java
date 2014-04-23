/*
 * Using the Java language, have the function arith_geo(arr) take the array of numbers stored in arr 
 * ...and return the string "Arithmetic" if the sequence follows an arithmetic pattern or 
 * ...return "Geometric" if it follows a geometric pattern. 
 * 
 * If the sequence doesn't follow either pattern return -1. 
 * An arithmetic sequence is one where the difference between each of the numbers is consistent, 
 * ...where as in a geometric sequence, each term after the first is multiplied by some constant 
 * ...or common ratio. Arithmetic example: [2, 4, 6, 8] and Geometric example: [2, 6, 18, 54]. 
 * 
 * Negative numbers may be entered as parameters, 0 will not be entered, and no array will contain all the same elements. 
 */

package arith_geo;

import java.util.Scanner;


public class Arith_Geo {


	public String arith_geo(int[] arr){
		if (arr.length>=3){
			if (!no_zero(arr) || !is_distinct(arr)){
				return "Please make sure that your input array does not contain zeros and that each element is distinct.";
			}
			else {
				if (is_arith(arr)){
					return "Arithmetic";
				}
				else if (is_geo(arr)){
					return "Geometric";
				}
				else {
					return "-1";
				}
			}
		}
		
		else{
			return "Your input array must be at least 3 elements long.";
		}
	}
	
	
	public boolean is_arith(int[] arr){
		boolean result = true;
		for (int i = 0; i<arr.length-2; i++){
			if (arr[i+1]-arr[i] != arr[i+2]-arr[i+1]){
				result = false;
				break;
			}
		}
		return result;
	}
	
	public boolean is_geo(int[] arr){
		boolean result = true;
		for (int i = 0; i<arr.length-2; i++){
			if ((double) arr[i+1]/ (double) arr[i] != (double) arr[i+2]/ (double) arr[i+1]){
				result = false;
				break;
			}
		}
		return result;
	}
	
	
	public boolean no_zero(int[] arr){
		boolean result = true;
		for (int i = 0; i<arr.length; i++){
			if (arr[i]==0){
				result = false;
				break;
			}
		}
		return result;
	}
	
	public boolean is_distinct(int[] arr){
		boolean result = true;
		for (int i = 0; i<arr.length-1; i++){
			for (int j = i+1; j<arr.length; j++){
				if (arr[i] == arr[j]){
					result = false;
					break;
				}
			}
		}
		return result;
	}

	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Arith_Geo test = new Arith_Geo();
		
		//Enter the int[] with ints separated by single space.
		String [] items = s.nextLine().split(" ");
		int [] array = new int[items.length];
		for (int i = 0; i<items.length; i++){
			array[i] = Integer.parseInt(items[i]);
		}
		
		System.out.println(test.arith_geo(array));	
		s.close();

	}

}


/*What did I learn from this exercise?
 * 1. This is how you convert an ArrayList to a List:
 * 		ArrayList <Integer> list = new ArrayList<>();
 * 		Integer [] array = list.toArray( new Integer [list.size()]);
 * 	  The out put has to be an array to objects. In this case the it's an Array of Integer objects.
 * 
 * 2. When you println(array); you're going to print the address of that array: [I@2fad4242
 * 3. System.out.println(array.toString()); also only prints the address of the array: e.g. [I@2fad4242
 * 4. System.out.println(Arrays.toString(array)); prints the content: e.g. [1, 2, 3]
 * 
 * 5. To convert an Array of Strings to an int[], 
 * 		first, create an empty int[] with the length equal to the length of the String Array.
 * 			int[] array = new int[string_array.length];
 * 		then, use a for-loop to add each Integer.praseInt(string_array[i]) element to the int[].
 * 			int [] array = new int[items.length];
			for (int i = 0; i<items.length; i++){
				array[i] = Integer.parseInt(items[i]);
			}
 * 
 * 6. Integer.parseInt(String s); returns an int.
 * 7. Integer.valueOf(int i); converts i to Integer.
 * 8. intValue(Integer integer); convert integer to int. 
 * 
 * Question:
 * 1. Why is it that when I import java.util.Arrays; Eclipse tells me that the import statement is redundant. 
*/