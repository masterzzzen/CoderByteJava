/*
 * Using the Java language, have the function SimpleMode(arr) take the array of numbers stored in arr and 
 * ...return the number that appears most frequently (the mode). 
 * For example: if arr contains [10, 4, 5, 2, 4] the output should be 4. 
 * If there is more than one mode return the one that appeared in the array first (ie. [5, 10, 10, 6, 5] 
 * should return 5 because it appeared first). If there is no mode return -1. The array will not be empty. 
 */


package simple_mode;
import java.util.*;

public class Simple_Mode {

	
	List <Integer> lengths = new ArrayList<>();
	List <Integer> sorted = new ArrayList<>();
	
	public int simple_mode(int[] arr){

		for (int i = 0; i<arr.length; i++){
			int n = 0;
			for (int j = 0; j<arr.length; j++){
				if (arr[i] == arr[j]){
					n++;					
				}
			}
			lengths.add(n);
			sorted.add(n);
		}
		
		//System.out.println("The lengths is: " + lengths);
		Collections.sort(sorted);
		//System.out.println("The sorted is: " + sorted);
		Integer max = Collections.max(sorted);
		//System.out.println("The max: " + max);
		Integer index = lengths.indexOf(max);
		//System.out.println("The index is: " + index);
		Integer mode = arr[index];
		//System.out.println("The mode is: " + mode);
		
		if (sorted.get(sorted.size()-max) != sorted.get(sorted.size()-max-1)){
			return mode;
		}
		else {
			return -1;
		}
	}
	
	public boolean check(){
	//This method checks if there is a unique mode.
		boolean result = true;
		outter: for (int k = 0; k<lengths.size(); k++){
			for (int l = 1; l<lengths.size(); l++){
				if (lengths.get(k) == lengths.get(l)){
					result = false;
					break outter;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
	    Scanner  s = new Scanner(System.in);
	    Simple_Mode test = new Simple_Mode();
	    
		String [] items = s.nextLine().split(" ");
		int [] array = new int[items.length];
		for (int i = 0; i<items.length; i++){
			array[i] = Integer.parseInt(items[i]);
		}
		
		System.out.println(test.simple_mode(array));	
		s.close();

	}

}
