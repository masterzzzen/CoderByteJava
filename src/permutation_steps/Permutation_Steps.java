/*
 * Using the Java language, have the function PermutationStep(num) take the num parameter being passed and 
 * ...return the next number greater than num using the same digits. For example: if num is 123 return 132, 
 * ...if it's 12453 return 12534. If a number has no greater permutations, return -1 (ie. 999). 
 */

package permutation_steps;
import java.util.*;


public class Permutation_Steps {

	
	public int permutation_steps(int num){
		
		//Convert the int num to a int[]
		char[] c_arr = new Integer(num).toString().toCharArray();
		System.out.println(Arrays.toString(c_arr));
		int[] i_arr = new int[c_arr.length];
		for (int i = 0; i<c_arr.length; i++){
			i_arr[i] = Integer.parseInt(new Character(c_arr[i]).toString());
		}
		
		//Starting from the singles digit, if the tens digit is smaller than it, swap, 
		//if not, then compare the tens digits and hundreds digit, etc.
		
		//Declare variable to hold temporary values.
		int m = 0;
		int n = 0;
		for (int j = i_arr.length-1; j > 0; j--){
			if (i_arr[j] > i_arr[j-1]){
				m = i_arr[j];
				n = i_arr[j-1];
				i_arr[j] = n;
				i_arr[j-1] = m;
				break;
			}
		}
		//System.out.println(Arrays.toString(i_arr));
		
		//Convert the int[] back to a number.
		String s = "";
		for (int k = 0; k<i_arr.length; k++){
			s += new Integer(i_arr[k]).toString();
		}
		int result = Integer.parseInt(s); 
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Permutation_Steps test = new Permutation_Steps();
		System.out.println(test.permutation_steps(Integer.parseInt(s.nextLine())));
		s.close();

	}

}

/*What did I learn from this exercise?
 * 1. When I entered a large number like 12312413241324, I got a NumberFormatException in parseInt(). 
 * ...so, the Integer.parseInt() method has an upper limit for its input;
*/


