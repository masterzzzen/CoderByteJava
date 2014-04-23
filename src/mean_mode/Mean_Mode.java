/*
 * Using the Java language, have the function mean_mode(arr) take the array of numbers stored in arr 
 * ...and return 1 if the mode equals the mean, 0 if they don't equal each other (ie. [5, 3, 3, 3, 1] 
 * ...should return 1 because the mode (3) equals the mean (3)). 
 * 
 * The array will not be empty, will only contain positive integers, and will not contain more than one mode. 
 */

package mean_mode;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Mean_Mode {

	public int mean_mode(int[] arr){
		List <Integer> mode_list = mode(arr);
		mode_list.get(0);
		if (mode_list.size()==1){
			if (mode_list.get(0).intValue() == mean(arr)){
				return 1;
			}
			else {
				return 0;
			}
		} 
		else {
			System.out.println("Your array should only have 1 mode.");
			return 0;
		}
	}
	
	//This helper function finds the mean.
	public double mean(int[] arr){

		double sum = 0;
		for (int i : arr){
			sum += i;
		}
		double mean = sum / arr.length;
		return mean;
	}

	//This helper function finds the mode.
	public List <Integer> mode(int[] arr){
		//This array counts the number of times each number in the input array appears. 
		//For example, if the input array is [1, 1, 3, 2];
		//Then the counter_array will look like this: [0, 2, 1, 1].
		Arrays.sort(arr);
		int [] counter_array = new int [arr.length+1];
		for (int x : arr){
			counter_array[x]++;
		}
		
		//Find the number of times that the mode(s) appear.
		int max_count = 0; 
		for (int i = 0; i<counter_array.length; i++){
			if (max_count < counter_array[i]){
				max_count = counter_array[i];
			}
		}
		
		List <Integer> modes = new ArrayList<>();
		for (int i = 0; i<counter_array.length; i++){
			if (max_count == counter_array[i])
				modes.add(i);
		}

		return modes;
			

	}
	
	public static void main(String[] args) {

	    Scanner  s = new Scanner(System.in);
	    Mean_Mode test = new Mean_Mode();
	    
		String [] items = s.nextLine().split(" ");
		int [] array = new int[items.length];
		for (int i = 0; i<items.length; i++){
			array[i] = Integer.parseInt(items[i]);
		}
		
		System.out.println(test.mean_mode(array));	
		s.close();
	}

}


/*What did I learn from this exercise?
 * 1. To find the size of an ArrayList, call ArrayList.size();
 * 2. If you call List <Integer> modes = new ArrayList<>(); then you need to import both java.util.List and java.util.ArrayList.
*/
