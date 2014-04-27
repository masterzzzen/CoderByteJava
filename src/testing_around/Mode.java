package testing_around;
import java.util.*;


public class Mode {

	public static List<Integer> mode(int[] a) {
	    List<Integer> lstMode = new ArrayList<Integer>();
	    final int MAX_RANGE = 1001;
	    int[] counterArray = new int[MAX_RANGE]; //can be improved with some maths :)!
	    //setting the counts for the counter array.
	    for (int x : a) {
	        counterArray[x]++;
	    }
	    //finding the max value (mode).
	    int maxCount = counterArray[0];
	    for(int i = 0; i < MAX_RANGE; i++) {
	        if (maxCount < counterArray[i]) {
	            maxCount = counterArray[i];
	        }
	    }
	    //getting all the max values
	    for(int i = 0; i < MAX_RANGE; i++) {
	        if (maxCount == counterArray[i]) {
	            lstMode.add(new Integer(i));
	        }
	    }
	    return lstMode;
	}
	
	
	
	public static void main(String[] args) {

	    Scanner  s = new Scanner(System.in);
	    //Mode test = new Mode();
	    
		String [] items = s.nextLine().split(" ");
		int [] array = new int[items.length];
		for (int i = 0; i<items.length; i++){
			array[i] = Integer.parseInt(items[i]);
		}
		
		System.out.println(Mode.mode(array));	
		s.close();

	}

}
