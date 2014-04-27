/*
 * Using the Java language, have the function powers_of_two(num) take the num parameter 
 * ...being passed which will be an integer and return the string true if it's a power of two. 
 * 
 * If it's not return the string false. For example if the input is 16 then your program should 
 * ...return the string true but if the input is 22 then the output should be the string false. 
 */


package power_of_two;
import java.util.Scanner;

public class Power_Of_Two {

	public String power_of_two(int num){

		while (num>2 && num%2==0){
			num = num/2;
		}
		if (num == 2){
			return "true";
		}
		else{
			return "false";
		}

	}

	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Power_Of_Two test = new Power_Of_Two();
		System.out.println(test.power_of_two((Integer.parseInt(s.nextLine()))));
		s.close();

	}

}
