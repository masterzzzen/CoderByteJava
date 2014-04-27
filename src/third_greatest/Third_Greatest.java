/*
 * Using the Java language, have the function third_greatest(strArr) take the array of 
 * ...strings stored in strArr and return the third largest word within it. 
 * So for example: if strArr is ["hello", "world", "before", "all"] your output should be world 
 * ...because "before" is 6 letters long, and "hello" and "world" are both 5, but the output should 
 * ...be world because it appeared as the last 5 letter word in the array. 
 * 
 * If strArr was ["hello", "world", "after", "all"] the output should be after 
 * ...because the first three words are all 5 letters long, so return the last one. 
 * 
 * The array will have at least three strings and each string will only contain letters. 
 */



package third_greatest;
import java.util.*;


public class Third_Greatest {

	//Return the 3rd longest word
	public String third_greatest(String[] strArr){
		
		//Convert the String[] strArr into an ArrayList so that you can use ArrayList's indexOf() method
		List <String> list = Arrays.asList(strArr);
		List <Integer> lengths = new ArrayList<>();
		for (String s : list){
			lengths.add(s.length());
		}
		List <Integer> sorted = new ArrayList<>();
		for (String s : list){
			sorted.add(s.length());
		}
		System.out.println("The sorted list before: " + sorted);
		System.out.println("The normal list before: " + lengths);
		Collections.sort(sorted);
		System.out.println("The sorted list after: " + sorted);
		System.out.println("The normal list after: " + lengths);
		Integer value_of_third_greatest = sorted.get(sorted.size()-3);
		System.out.println("value_of_third_greatest: " + value_of_third_greatest);		
		Integer index_of_third_greatest = lengths.indexOf(value_of_third_greatest);
		System.out.println("index_of_third_greatest: " + index_of_third_greatest);
		return list.get(index_of_third_greatest);
	}
			

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Third_Greatest test = new Third_Greatest();

		String [] items = s.nextLine().split(" ");
		System.out.println(Arrays.toString(items));
		System.out.println(test.third_greatest(items));
		s.close();
	}

}

/*What did I learn from this exercise?
 * 1. int[] sorted_lengths = lengths; stores the reference of lengths to sorted_lenghts, 
 * ...such that the two reference variables refer to the same array.
 * 2. Arrays.copyOf(original, new_length); copies the original array by value.
 * 3. Arrays.asList(array); does not permanently convert array into a List.
 * 4. The following code causes ArrayIndexOutOfBounds exception. 
 * 		for (String s : strArr){
			lengths[Arrays.asList(strArr).indexOf(s)] = s.length();	
		}
 * 5. Java's Arrays has not indexOf() method. The closest thing is binarySearch(array_to_be_searched, key) 
 * ...and it requires that the array_to_be_searched be already sorted by the sort(int[]) method. 
 * 	WHAAAAAAAAAAAAAAAAATTTTTTTTTTTTTTTT!!!!!!!!!!!!!!!!!!!!!
 * 
		*/

 