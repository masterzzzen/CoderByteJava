package ab_check;

/*
 * Using the Java language, have the function AB_Check(str) take the str parameter 
 * ...being passed and return the string true if the characters a and b are separated by exactly 3 places 
 * ...anywhere in the string at least once (ie. "lane borrowed") would result in true because there is 
 * ...exactly three characters between a and b). Otherwise return the string false. 
 */


import java.util.Scanner;

public class AB_Check {
	
	public boolean ab_check(String str){
		
		boolean  result = false;
		if (str.length()<4){
			System.out.println("Please enter a String of at least 4 characters.");
			System.exit(0);
		}
		else{
			for (int i = 0; i<str.length()-3; i++){
				
				if (str.substring(i, i+1).equals("a") && str.substring(i+3, i+4).equals("b")) { 
					result = true;
					break;
				}		
				else{
					result = false;
				}
			}
		}
		return result;
	}
		

	public static void main(String[] args) {
		
	    Scanner  s = new Scanner(System.in);
	    AB_Check test = new AB_Check();
	    System.out.println(test.ab_check(s.nextLine()));
	    s.close();
	}

}
/*What did I learn from this exercise?
 * 1. You cannot use the return statement inside an if-else construct.
*/
