/*
 * Using the Java language, have the function array_addition(arr) take the array of numbers stored in arr 
 * ...and return the string true if any combination of numbers in the array can be added up to equal 
 * ...the largest number in the array, otherwise return the string false. 
 * 
 * For example: if arr contains [4, 6, 23, 10, 1, 3] the output should return true 
 * ...because 4 + 6 + 10 + 3 = 23. The array will not be empty, will not contain all the same elements, 
 * ...and may contain negative numbers. 
 */

package array_addition;

import java.util.Arrays;
import java.util.Scanner;


public class Array_Addition{

	public String array_addition(int[] arr){
		int sum = 0;
		if (arr.length == 0){
			return "You empty cannot be empty.";
		}
		else {
			Arrays.sort(arr);
			sum = sum_n_except_last(arr);
		}
		return new Boolean(sum == arr[arr.length-1]).toString();
	}
	
	public int sum_n_except_last (int[] arr){
		int sum = 0;
		for (int i = 0; i<arr.length-1; i++){
			sum +=arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Array_Addition test = new Array_Addition();
		
		//Enter the int[] with ints separated by single space.
		String [] items = s.nextLine().split(" ");
		int [] array = new int[items.length];
		for (int i = 0; i<items.length; i++){
			array[i] = Integer.parseInt(items[i]);
		}
		
		System.out.println(test.array_addition(array));
		s.close();

	}

}


