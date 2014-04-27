/*
 * Using the Java language, have the function PrimeMover(num) return the numth prime number. 
 * 
 * The range will be from 1 to 10^4. For example: if num is 16 the output should be 53 as 53 is the 16th prime number. 

 */

package prime_mover;

import java.util.*;


public class Prime_Mover {

	//This is the list of primes. The idea is that as long as the size of this List is less than the user input, 
	//...we add the next prime number to the List.
	private List<Integer> primes = new ArrayList<>();
	
	//This is the natural number from which 
	private int n = 0;

	public int prime_mover(int num ){
			
			while (primes.size() < num){	
 
				if (isPrime(n)==true){
					primes.add(n);
				}
				n++;
				
			}
			return primes.get(primes.size()-1);
	}

	
	public boolean isPrime(int number){
		List<Double> quotients = new ArrayList<>();
		double temp = 0.0;
		boolean result = false;	
		if (number>=2){
			for (int i = number; i >= 2; i--) {
				temp = (double) number/ (double) i;
				if (temp == (double) (number/i)){
						quotients.add(temp);
					}
				}
				
				if (quotients.size()<=1){
					result =  true;
				}
				else{
					result = false;
				}
				return result;	
			}
		
		else{
			return result;
		}
		
	}
		

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Prime_Mover test = new Prime_Mover();
		//System.out.println("Please enter an integer between 1 and 10^4 inclusive.");
		//System.out.println(test.isPrime(Integer.parseInt(s.nextLine())));
		System.out.println(test.prime_mover((Integer.parseInt(s.nextLine()))));
		s.close();
	}
}
