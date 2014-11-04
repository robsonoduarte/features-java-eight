package br.com.mystudies.java.lambda;

import static java.util.Arrays.asList;



public class Main {

	public static void main(String[] args) {
		
		asList("Robson", "Ana Mara", "Cibele", "Tatiane", "Antonio" , "Aparecida")
			.stream()
			.filter( s -> s.startsWith("A"))
			.forEach( s -> System.out.println(s));
	}	
}
