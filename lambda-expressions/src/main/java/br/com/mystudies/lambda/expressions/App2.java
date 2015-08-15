package br.com.mystudies.lambda.expressions;

import java.util.Comparator;

public class App2 {

	public static void main(String[] args) {

	}














	private static Comparator<? super Integer> compartor() {
		return (x, y) -> Integer.compare(x, y);
	}













}
