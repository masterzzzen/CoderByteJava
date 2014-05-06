/*
 * Using the Java language, have the function Consecutive(arr) take the array of integers stored in arr and 
 * ...return the minimum number of integers needed to make the contents of arr consecutive from the lowest 
 * ...number to the highest number. For example: If arr contains [4, 8, 6] then the output should be 2 because 
 * ...two numbers need to be added to the array (5 and 7) to make it a consecutive array of numbers from 4 to 8. 
 * 
 * Negative numbers may be entered as parameters and no array will have less than 2 elements. 
 */


package consecutive;

import java.util.Arrays;
import java.util.Scanner;



public class Consecutive {

	public int consecutive(int[] arr){
		int result = 0;
		Arrays.sort(arr);
		result = arr[arr.length-1]-arr[0]-arr.length+1;
		return result;
	}
	
	
	public static void main(String[] args) {

	    Scanner  s = new Scanner(System.in);
	    Consecutive test = new Consecutive();
	    
		String [] items = s.nextLine().split(" ");
		int [] array = new int[items.length];
		for (int i = 0; i<items.length; i++){
			array[i] = Integer.parseInt(items[i]);
		}
		
		System.out.println(test.consecutive(array));	
		s.close();
	}

}
