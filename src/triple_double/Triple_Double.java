/*
 * Using the Java language, have the function TripleDouble(num1,num2) take both parameters being passed, 
 * ...and return 1 if there is a straight triple of a number at any place in num1 and also a straight double 
 * ...of the same number in num2. For example: if num1 equals 451999277 and num2 equals 41177722899, 
 * ...then return 1 because in the first parameter you have the straight triple 999 and you have a straight 
 * ...double, 99, of the same number in the second parameter. If this isn't the case, return 0. 

 */


package triple_double;

import java.util.Scanner;

public class Triple_Double {

	public int triple_double(int num1, int num2){
		
		int result = 0;
		
		String num_str1 = new Integer(num1).toString();
		//System.out.println("num_str1 is: " + num_str1);
		String num_str2 = new Integer(num2).toString();
		//System.out.println("num_str2 is: " + num_str2);	
		
		//System.out.println("check3(num_str1) is: " + check3(num_str1));
		//System.out.println("check2(num_str2) is: " + check2(num_str2));
		
		if (check3(num_str1) && check2(num_str2)){
			result = 1;
		}
		else {
			result = 0;
		}
		return result;
	}
	
	//This method checks if there is a double in the String.
	public boolean check2(String str){
		
		boolean result = false;
		for (int i = 0; i<str.length()-1; i++){
			//System.out.println("str.substring(i,i+1) is: " + str.substring(i,i+1));
			//System.out.println("str.substring(i+1,i+2) is: " + str.substring(i+1,i+2));
			if (str.substring(i,i+1).equals(str.substring(i+1,i+2))){
				result = true;
				break;
			}
		}
		
		return result;
	}	
	
	//This method checks if there is a triple in the String.
	public boolean check3(String str){
		
		boolean result = false;
		outter: for (int i = 0; i<str.length()-2; i++){
			if (str.substring(i,i+1).equals(str.substring(i+1,i+2))){
				for (int j = i+1; j<str.length()-1; j++){
					if (str.substring(j,j+1).equals(str.substring(j+1,j+2))){
						result = true;
						break outter;
					}
				}

			}
		}
		return result;
	}
	
	
	
	
	public static void main(String[] args) {
		
	    Scanner  s = new Scanner(System.in);
	    Triple_Double test = new Triple_Double();
	    System.out.println(test.triple_double(Integer.parseInt(s.nextLine()), Integer.parseInt(s.nextLine())));
	    s.close();
	}

}
