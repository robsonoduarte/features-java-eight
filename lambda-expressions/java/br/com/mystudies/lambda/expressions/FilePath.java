package br.com.mystudies.lambda.expressions;

import static java.util.Arrays.asList;

import java.io.File;
import java.io.FileFilter;

public class FilePath {

	public static void main(String[] args) {

		File[] directories;
	

		
		// without lambda 
		
		directories = 
			new File("/").listFiles(new FileFilter() {
				@Override
				public boolean accept(File file) {
					return file.isDirectory();
				}
		});

		
		
		
		print(directories);
		
		

		
		
		
		
		// with lambda	
		directories = 
			new File("/")
				.listFiles(f -> {
						return f.isDirectory();
					});

		
		
		print(directories);
		

	}

	
	
	
	
	
	
	
	

	
	
	
	
	private static void print(File[] directories) {
		asList(directories)
			.stream()
			.forEach(f -> {
				System.out.println(f.getAbsolutePath());
			});
	}

	
	
	

}
