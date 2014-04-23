/*
 * Using the Java language, have the function time_convert(num) take the num parameter 
 * ...being passed and return the number of hours and minutes the parameter converts 
 * ...to (ie. if num = 63 then the output should be 1:3). 
 * 
 * Separate the number of hours and minutes with a colon. 
 */


package time_convert;

import java.util.Scanner;

public class Time_Convert {

	public String time_convert(int num){
		
		return num/60 + ":" + num%60;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Time_Convert test = new Time_Convert();
		System.out.println(test.time_convert(Integer.parseInt(s.nextLine())));
		s.close();
	}
}
