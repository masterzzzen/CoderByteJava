/*
 * Using the Java language, have the function BinaryConverter(str) return the decimal form of the binary value. 
 * 
 * For example: if 101 is passed return 5, or if 1000 is passed return 8. 
 */

package binary_converter;
import java.util.*;

public class Binary_Converter {

	public String convert (String str){
		
		String result = "";
		
		//n is the exponent;
		int n = 0;
		//z is the value of the input in 10s format.
		int z = 0;
		
		char[] c_arr = str.toCharArray();
		int[] i_arr = new int[c_arr.length];
		for (int i = 0; i<c_arr.length; i++){
			i_arr[i] = Integer.parseInt(new Character(c_arr[i]).toString());
		}
		//System.out.println("The input is: " + Arrays.toString(i_arr));

		if (!fits(i_arr)){
			result = "This input doesn't fit the requirement. Your input must be a sequence of 0s and/or 1s.";
		}
		else {
			for (int k = i_arr.length-1; k>=0; k--){
				//System.out.println("n is: " + n);
				//System.out.println("i_arr[k] is: " + i_arr[k] + " and" + " k is: " + k);
				//System.out.println("Math.pow(2,n) is: " + Math.pow(2,n));
				z += i_arr[k] * Math.pow(2,n);
				//System.out.println("z is: " + z);
				n++;
				//System.out.println("n is: " + n);
			}
			result = new Integer(z).toString();
		}
		return result;
	}		


	//This method checks if the input fits the format.
	public boolean fits(int[] arr){
		boolean result = false;
		for (int i : arr){
			if (i==1 || i==0){
				result = true;
			}
			else{
				result = false;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Binary_Converter test = new Binary_Converter();
	    System.out.print(test.convert(s.nextLine())); 
	    s.close();
	}

}
