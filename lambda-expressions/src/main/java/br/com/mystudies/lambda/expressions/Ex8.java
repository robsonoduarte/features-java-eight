package br.com.mystudies.lambda.expressions;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class Ex8 {



	public static void main(String[] args){

		List<Runnable> runners = new ArrayList<>();

		asList("Robson", "Luiz", "Wellington")
			.forEach(name -> {
				runners.add(() -> print(name));
			});


		run(runners);









		String[] names = {"Ana Mara", "Cida", "Maria"};

		for (int i = 0; i < names.length; i++) {
			//runners.add(() -> print(names[i])); this don't compile because in lambda the variables need is immutable and the (i) isn't
		}

	}
























	private static void run(List<Runnable> runners) {
		runners.forEach(r -> {
			new Thread(r).start();
		});
		runners.clear();
	}
























	private static void print(String s) {
		System.out.println(s);
	}
























}
