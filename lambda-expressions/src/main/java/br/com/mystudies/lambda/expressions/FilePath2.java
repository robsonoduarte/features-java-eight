package br.com.mystudies.lambda.expressions;

import static java.util.Arrays.asList;

import java.io.File;
import java.io.FilenameFilter;

public class FilePath2 {

	public static void main(String[] args) {

		
	

		
			String[] name = 
				new File("/teste/").list( (f,n) -> {					
					return f.isFile() ? n.contains("txt") : false ;
				});
			
			
			asList(name).stream()
				.forEach(System.out::println);
		
			
			
			
		
	}

	
	
	
	
	
	
	
	

	
	
	

}
