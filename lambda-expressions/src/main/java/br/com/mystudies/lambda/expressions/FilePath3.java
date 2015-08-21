package br.com.mystudies.lambda.expressions;

import static java.util.Arrays.asList;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Comparator;

public class FilePath3 {

	public static void main(String[] args) {					
		
		
		asList(new File("/").list())
			.stream()
			.sorted()
			.forEach(System.out::println);
				
		
	}

	
	
	
	
	
	
	
	

	
	
	

}
