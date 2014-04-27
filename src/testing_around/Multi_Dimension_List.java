package testing_around;

import java.util.*;

public class Multi_Dimension_List {

	public void build(){
	int n = 0;
	List<List<String>> ls2d = new ArrayList<List<String>>();
	List<String> x = new ArrayList<>();
	x.add("Hello");
	x.add("World!");
	ls2d.add(x);
	System.out.println(ls2d.get(0));
	ls2d.get(0).add("Test");
	ls2d.get(1).add("Test2");
	System.out.println(ls2d.get(0));
	for(List<String> ls : ls2d) {
	    System.out.println(Arrays.deepToString(ls.toArray()));
	}
	}
	
	public static void main(String[] args) {

		Multi_Dimension_List test = new Multi_Dimension_List();
		test.build();
	}

}

