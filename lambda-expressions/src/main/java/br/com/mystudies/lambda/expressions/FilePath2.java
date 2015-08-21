package br.com.mystudies.lambda.expressions;

import static java.util.Arrays.asList;

import java.io.File;
import java.io.FilenameFilter;

public class FilePath2 {

	public static void main(String[] args) {

		
	

		
			String[] name = 
				new File("/teste/").list( (f,n) -> {	
					System.out.println(f.getAbsolutePath());
					return n.contains("txt") ? true : false ;
				});
			
			
			
			asList(name).stream()
				.forEach(System.out::println);
		
			
		
	}

	
	
	
	
	
	
	
	

	
	
	

}
