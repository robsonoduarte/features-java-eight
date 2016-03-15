package br.com.mystudies.lambda.expressions;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class Ex8 {



	public static void main(String[] args){

		List<Runnable> runners = new ArrayList<>();

		asList("Robson", "Luiz", "Wellington")
			.forEach(s -> {
				runners.add(() -> print(s));
			});



	}
























	private static void print(String s) {
		System.out.println(s);
	}
























}
