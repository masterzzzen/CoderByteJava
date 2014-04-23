/*
 * Using the Java language, have the function counting_minutesI(str) take the str parameter 
 * ...being passed which will be two times (each properly formatted with a colon and am or pm) 
 * ...separated by a hyphen and return the total number of minutes between the two times. 
 * 
 * The time will be in a 12 hour clock format. 
 * For example: if str is 9:00am-10:00am then the output should be 60. 
 * If str is 1:00pm-11:00am the output should be 1320. 
 */



package counting_minutes;
import java.util.Scanner;


public class Counting_Minutes {

	public int counting_minutes(String str){

		int[] pair = convert(str);
		return pair[1] - pair[0];
	}
	
	//This helper function checks if the time is in the morning.
	public boolean is_am(String str){
		String[] arr = str.split("-");
		if (arr[0].substring(arr[0].length()-3).equals("am")){
			return true;
		}
		else{
			return false;
		}
	}

	//This helper function checks if the time is in the afternoon.
	public boolean is_pm(String str){
		String[] arr = str.split("-");
		if (arr[1].substring(arr[1].length()-3).equals("pm")){
			return true;
		}
		else{
			return false;
		}
	}
	
	//This helper function converts the times from the format of "1:00pm-2:00pm" to [#mins, #mins].
	public int[] convert(String str){
		
		String[] arr_temp = str.split("-");
		String[] arr_temp_start = arr_temp[0].split(":");
		String[] arr_temp_end = arr_temp[1].split(":");		
		
		int hour_start = 0;
		int hour_end = 0;

		if (is_am(str)){
			hour_start = Integer.parseInt(arr_temp_start[0]);
			hour_end = Integer.parseInt(arr_temp_end[0]);
		}
		else {
			hour_start = Integer.parseInt(arr_temp_start[0])+12;		
			hour_end = Integer.parseInt(arr_temp_end[0])+12;		
		}
		
		int minute_start = Integer.parseInt(arr_temp_start[1].substring(0,2));
		int minute_end = Integer.parseInt(arr_temp_end[1].substring(0,2));

		int time_start = hour_start*60 + minute_start;
		int time_end = hour_end*60 + minute_end;
		int[] arr_times = {time_start, time_end};
		
		return arr_times;

		
	}
	
	
	public static void main(String[] args) {

	    Scanner  s = new Scanner(System.in);
	    Counting_Minutes test = new Counting_Minutes();
	    System.out.println(test.counting_minutes(s.nextLine()));
	    s.close();
	}

}

/*What did I learn from this exercise?
 * 1. Variables declared inside the if-else block cannot be reached from outside that if-else block.
 * 2. Java code is sequential in that code on line 10 cannot use variables defined on line 20.
 * ...However, it doesn't matter where you declare your methods.
 * 3. To use Array, you don't need to specifically import Arrays, but if you use any methods of the Arrays class,
 * ...then you need to import java.util.Arrays;
*/

