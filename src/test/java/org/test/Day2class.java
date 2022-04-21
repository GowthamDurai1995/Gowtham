package org.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Day2class {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
		String s = dateFormat.format(date);
		System.out.println(s);
		
	}
	
		
}

