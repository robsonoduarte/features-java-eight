package br.com.mystudies.lambda.expressions;

import java.io.File;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

public class Ex4 {





	public static void main(String[] args) throws Exception {
		Files.walk(Paths.get(path()))
			.map(Path::toFile)
			.sorted(sort())
			.forEach(System.out::println);
	}


















	private static Comparator<? super File> sort() {
		return (f1,f2) -> {
			   if (f1.isDirectory() && !f2.isDirectory()) {
	                return -1;
	            } else if (!f1.isDirectory() && f2.isDirectory()) {
	                return 1;
	            } else {
	                return f1.getName().toLowerCase().compareTo(f2.getName().toLowerCase());
	            }
		};

	}




















	private static URI path() throws Exception {
		return Ex4.class.getResource("/groups").toURI();
	}














}
