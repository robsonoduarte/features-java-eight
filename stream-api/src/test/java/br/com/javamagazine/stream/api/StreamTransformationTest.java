package br.com.javamagazine.stream.api;

import static java.util.stream.Collectors.toList;
import static org.apache.commons.lang3.StringUtils.isAllUpperCase;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class StreamTransformationTest extends BasicTest {

	@Test
	public void testMapMethodForStreamTransformation() {

		List<String> nomes =
				pessoas.stream()
					.map(p -> p.nome = p.nome.toUpperCase())
					.collect(toList());

		for (String nome : nomes) {
			assertThat(isAllUpperCase(nome), not(false));
		}
	}

	
	@Test
	public void testFlatMapMethodForStreamTransformation() {
		
		//http://www.journaldev.com/2774/java-8-stream-api-example-tutorial
		//http://pt.slideshare.net/chris.e.richardson/map-flatmap-and-reduce-are-your-new-best-friends-simpler-collections-concurrency-and-big-data-jax-jax2014
/*		pessoas.stream()
			.flatMap(p -> p.nome = p.nome.toUpperCase())
			.collect(toList());*/
	}

	
	
}
