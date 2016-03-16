package br.com.mystudies.lambda.expressions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ex9 {



	public static void main(String[] args){

		Collection2<Person> persons = new ArrayList2<>();

		persons.add(new Person("Thiago", 28));
		persons.add(new Person("Robson", 39));
		persons.add(new Person("Ana Mara", 40));
		persons.add(new Person("Aparecida", 59));
		persons.add(new Person("Maria", 81));

		persons.forEachIf(p -> {System.out.println(p.name);}, p -> p.age > 40);











	}






















	interface Collection2<T> extends Collection<T>{
		default void forEachIf(Consumer<T> action, Predicate<T> predicate){
			forEach(e ->{
				if(predicate.test(e)){
					action.accept(e);
				}
			});
		}
	}



	public static class ArrayList2<T> extends ArrayList<T> implements Collection2<T> {
	}



	public static class Person{
		String name;
		int age;

		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
	}

}
