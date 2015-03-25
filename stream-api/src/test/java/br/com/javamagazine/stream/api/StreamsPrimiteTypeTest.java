package br.com.javamagazine.stream.api;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.Matchers.equalTo;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamsPrimiteTypeTest extends BaseTest{

	@Test
	public void testOFMethod() {
		IntStream intStream = IntStream.of(1, 2, 3);
		
		assertThat(intStream.sum(), equalTo(6));
	}
	
	
	@Test
	public void testRangeMethod() {
		
		IntStream intStream = IntStream.range(1, 10); // range do 1 ao 9 excluindo o 10
		
		assertThat(intStream.toArray(), equalTo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
	}
	
	
	@Test
	public void testRangeClosedMethod() {
		
		IntStream intStream = IntStream.rangeClosed(1, 10); // range do 1 ao 10 incluindo o 10
		
		assertThat(intStream.toArray(), equalTo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
	}
	
	
	@Test
	public void testMapToIntMethod() {
		
		
		IntStream idadesMenoresDe18 = 
				pessoas.stream()
					.filter( p -> p.getIdade() < 18 )
					.mapToInt(Pessoa::getIdade);
			
	
		assertThat(idadesMenoresDe18.toArray(), equalTo(new int[]{10, 11, 12, 9, 1, 3}));
		
	}
	
	
	
	@Test
	public void testBoxedMethod() {
		
		Stream<Integer> stream = IntStream.rangeClosed(1, 10).boxed();
		
		assertThat(stream.toArray(), arrayContaining(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}
	
	@Test
	public void testMethodsSumAverageMaxMin() {
		
		
		assertThat(IntStream.rangeClosed(1, 10).sum(), equalTo(55));
		assertThat(IntStream.rangeClosed(1, 10).average().getAsDouble(), equalTo(5.5));
		assertThat(IntStream.rangeClosed(1, 10).max().getAsInt(), equalTo(10));
		assertThat(IntStream.rangeClosed(1, 10).min().getAsInt(), equalTo(1));
	}

	
	
}
