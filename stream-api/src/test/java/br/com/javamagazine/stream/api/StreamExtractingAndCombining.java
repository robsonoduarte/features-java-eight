package br.com.javamagazine.stream.api;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamExtractingAndCombining {

	@Test
	public void test() {						
		try {
			Stream.generate(Math::random).collect(toList());
			fail();
		} catch (Error error) {
			error.printStackTrace();
		}
	}

	
	
	@Test
	public void test2() {
		
		List<Double> list = 
				Stream.generate(Math::random).limit(10).collect(toList());
		
		assertThat(list, hasSize(10));
		
	}
	
	
	
	
	@Test
	public void test3() {
				
	}
	

	
}
