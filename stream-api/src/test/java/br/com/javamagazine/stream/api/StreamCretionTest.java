package br.com.javamagazine.stream.api;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamCretionTest {


	@Test
	public void test1() {

		Stream<String> stream = Stream.of("Pessoa", "Cachorro", "Gato");

		assertThat(stream.count(), equalTo(3l));
	}


	@Test
	public void test2() {

		Stream<Double> stream = Stream.generate(Math::random).limit(10);

		assertThat(stream.count(), equalTo(10l));
	}


	@Test
	public void test3() {

		Stream<Integer> stream =  Stream.iterate(1, n -> n + 1).limit(10);

		assertThat(stream.count(), equalTo(10l));
	}





	@Test
	public void test4() {

		Stream<String> stream = Arrays.stream(new String[]{"Pessoa", "Cachorro", "Gato"}, 1, 2);

		assertThat(stream.count(), equalTo(1l));
	}




}
