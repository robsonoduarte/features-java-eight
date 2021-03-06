package br.com.javamagazine.stream.api;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Stream.concat;
import static java.util.stream.Stream.of;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamExtractingAndCombining extends BaseTest{

	
	@Test
	public void testInfinitGenerationStream() {						
		try {
			Stream.generate(Math::random).collect(toList());
			fail();
		} catch (Error error) {
			error.printStackTrace();
		}
	}
	
	
	@Test
	public void testLimitedGenerationStream() {						

		List<Double> list = 
				Stream.generate(Math::random).limit(10).collect(toList());

		assertThat(list, hasSize(10));
		
	}

	
	
	@Test
	public void testShipMehtod() throws IOException {
		
		Path path = Paths.get("src/test/resources/file.txt");
		
		List<String> list = 
				Files.lines(path).skip(2).collect(toList());
		
		assertThat(list, hasSize(8));
	}
	
	
	
	
	@Test
	public void testConatMehtod() {
		
		List<Integer> list = 
				concat(of(1, 2, 3), concat(of(3, 4, 5), of(6, 7, 8))).collect(toList());
		
		assertThat(list, hasSize(9));
	}
	

	
}
