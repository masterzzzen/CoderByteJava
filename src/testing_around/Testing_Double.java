/*
 * In this program, I wanted to test to see at what time int gets upgraded to double 
 */

package testing_around;

import java.util.Scanner;


public class Testing_Double {

	public double testing_double(int i, int j){
		System.out.println("i/j: " + i/j);
		System.out.println("(double) i / (double) j: " + (double) i / (double) j);
		System.out.println("(double) i/j: "+ (double) i/j);
		System.out.println("(double) (i/j): " + (double) (i/j));
		System.out.println("(double) i - j: " + ((double) i - j));
		System.out.println("i - (double) j: " + (i - (double) j));
		return 0.1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Testing_Double test = new Testing_Double();
		System.out.println(test.testing_double(Integer.parseInt(s.nextLine()),Integer.parseInt(s.nextLine())));
		s.close();

	}

}
