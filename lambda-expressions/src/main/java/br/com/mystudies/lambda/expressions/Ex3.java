package br.com.mystudies.lambda.expressions;

import static java.util.Arrays.asList;

import java.io.File;

public class Ex3 {



	public static void main(String[] args) throws Exception {

		String[] name =
			files().list( (f,n) -> {
				return n.endsWith(".txt");
			});


		asList(name)
			.stream()
		 	.forEach(System.out::println);

	}


























	private static File files() throws Exception {
		return new File(Ex3.class.getResource("/files").toURI());
	}


}
