/*
 * Using the Java language, have the function arith_geo_ii(arr) take the array of numbers stored in arr 
 * ...and return the string "Arithmetic" if the sequence follows an arithmetic pattern or 
 * ...return "Geometric" if it follows a geometric pattern. 
 * 
 * If the sequence doesn't follow either pattern return -1. An arithmetic sequence is one where 
 * ...the difference between each of the numbers is consistent, where as in a geometric sequence, 
 * ...each term after the first is multiplied by some constant or common ratio. 
 * 
 * Arithmetic example: [2, 4, 6, 8] and Geometric example: [2, 6, 18, 54]. 
 * Negative numbers may be entered as parameters, 0 will not be entered, 
 * ...and no array will contain all the same elements. 
 */


package arith_geo_ii;

import java.util.*;

public class Arith_Geo_II {

	public String arith_geo_ii(int[] arr){
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
		Arith_Geo_II test = new Arith_Geo_II();
		
		String [] items = s.nextLine().split(" ");
		int [] array = new int[items.length];
		for (int i = 0; i<items.length; i++){
			array[i] = Integer.parseInt(items[i]);
		}
		System.out.println(test.arith_geo_ii(array));
		s.close();
	}

}
