package br.com.mystudies.lambda.expressions;

import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.Comparator;

public class Ex1 {

	public static void main(String[] args) {


		Integer[] a = new Integer[]{10,2,-3,60,50};

		Arrays.sort(a, compartor());

		asList(a).stream().forEach(System.out::println);
		
		// test push.....

	}














	private static Comparator<? super Integer> compartor() {
		return (x, y) -> Integer.compare(x, y);
	}













}
