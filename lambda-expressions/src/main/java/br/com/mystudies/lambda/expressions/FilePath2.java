package br.com.mystudies.lambda.expressions;

import static java.util.Arrays.asList;

import java.io.File;
import java.nio.file.Paths;

public class FilePath2 {

	public static void main(String[] args) {

		File file = temp();


		System.out.println(file);


		String[] name =
			file.list((f,n) -> {
				return f.isFile() && n.contains("txt");
			});


		asList(name).stream()
		 	.forEach(System.out::println);


	}





















	private static File temp() {
		return Paths.get("src/test/java").getFileName().toFile();
	}







}
