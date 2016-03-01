package br.com.mystudies.lambda.expressions;

import static java.util.Arrays.asList;

import java.io.File;

public class Ex4 {



	public static void main(String[] args) {


		asList(new File("/").list())
			.stream()
			.sorted()
			.forEach(System.out::println);

	}














}
