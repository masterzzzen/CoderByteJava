/*
 * Using the Java language, have the function second_great_low(arr) take the array of numbers 
 * ...stored in arr and return the second lowest and second greatest numbers, respectively, 
 * ...separated by a space. For example: if arr contains [7, 7, 12, 98, 106] the output should be 12 98. 
 * 
 * The array will not be empty and will contain at least 2 numbers. It can get tricky if there's just two numbers! 
 */
package second_great_low;
import java.util.Scanner;
import java.util.Arrays;

public class Second_Great_Low {

	public int [] second_great_low(int[] arr){
		int[] pair = new int[2];
		Arrays.sort(arr);
		pair[0] = arr[1];
		pair[1] = arr[arr.length-2];
		return pair;
	}

	public static void main(String[] args) {

	    Scanner  s = new Scanner(System.in);
	    Second_Great_Low test = new Second_Great_Low();
	    
		String [] items = s.nextLine().split(" ");
		int [] array = new int[items.length];
		for (int i = 0; i<items.length; i++){
			array[i] = Integer.parseInt(items[i]);
		}
		
		System.out.println(Arrays.toString(test.second_great_low(array)));	
		s.close();
	}
}

