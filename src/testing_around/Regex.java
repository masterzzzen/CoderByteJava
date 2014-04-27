package testing_around;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Regex {

	public String see(String str){
		String s = "";
		/*
		//Pattern pattern = Pattern.compile("\\d{1,}\\\:\\\d{2}\\\am|pm");

		Pattern pattern = Pattern.compile("\\.");   .
		Pattern pattern = Pattern.compile(".");   .
		Pattern pattern = Pattern.compile("8");   8
		Pattern pattern = Pattern.compile(\\"8");   nothing
		Pattern pattern = Pattern.compile("pm"|"am"); error
		Pattern pattern = Pattern.compile("\\pm|am"); java.util.regex.PatternSyntaxException
		
		*/
		
		
		Pattern pattern = Pattern.compile("\\\"pm\"|\"am\"");
		Matcher matcher = pattern.matcher(str);
		
		if (matcher.find()){
			System.out.println("OK");
		}
		return s;
	}
	
	public static void main(String[] args) {
	    Scanner  s = new Scanner(System.in);
	    Regex test = new Regex();
	    System.out.println(test.see(s.nextLine()));
	    s.close();

	}

}
