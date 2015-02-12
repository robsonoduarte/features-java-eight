package br.com.javamagazine.stream.api;

import static java.util.stream.Collectors.toList;
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

public class StreamExtractingAndCombining extends BasicTest{

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
	public void test2() throws IOException {
		
		
		Path path = Paths.get("src/test/resources/file.txt");
		
		List<String> list = 
				Files.lines(path).skip(2).collect(toList());
		
		assertThat(list, hasSize(8));
	}
	
	
	
	
	@Test
	public void test3() {
		
		getPessoas().stream().filter(p -> p.idade < 10 || p.idade > 20).forEach(System.out::println);
		
		/*Stream.concat(a, b)*/
	}
	

	
}
