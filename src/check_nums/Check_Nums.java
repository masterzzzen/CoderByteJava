/*
 * Using the Java language, have the function Check_Nums(num1,num2) take both parameters 
 * ...being passed and return the string true if num2 is greater than num1, otherwise return the string false. 
 * If the parameter values are equal to each other then return the string -1. 
 */
package check_nums;

import java.util.Scanner;

public class Check_Nums {

	public String check_nums(int num1, int num2){
		if (num1 > num2){
			return "true";
		}
		else if (num1 < num2){
			return "false";
		}
		else{
			return "-1";
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Check_Nums test = new Check_Nums();
		try{
		System.out.println(test.check_nums(Integer.parseInt(s.nextLine()),Integer.parseInt(s.nextLine())));
		}
		catch(NumberFormatException e){
			System.out.println("Your inputs must be Integers.");
		}
		finally{
			s.close();
		}

	}

}
