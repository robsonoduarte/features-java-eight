package br.com.mystudies.lambda.expressions;

import java.io.File;
import java.io.FileFilter;

public class FilePath {

	public static void main(String[] args) {



		new File("").listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return false;
			}
		});




		new File("").listFiles(f -> {return true;});


	}


}
