package br.com.mystudies.lambda.expressions;

import java.io.File;
import java.io.FilenameFilter;

public class FilePath2 {

	public static void main(String[] args) {

		String[] files;
	

		
		// without lambda 
		
		files =
			new File("/teste/").list(new FilenameFilter() {			
			@Override
			public boolean accept(File file, String name) {						
				return name.contains("txt");
			}
		});

		
		
		
	
		/*asList(files).stream().forEach(System.out::println);*/
		

		
		
		files = new File("/teste/")
				.list( (f,s) -> {
					return true;
				});
	}

	
	
	
	
	
	
	
	

	
	
	

}
