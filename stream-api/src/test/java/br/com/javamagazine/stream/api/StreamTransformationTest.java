package br.com.javamagazine.stream.api;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static org.apache.commons.lang3.StringUtils.isAllUpperCase;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.Set;

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
		Set<String> hobbys = 
			pessoas.stream()
				.filter(p -> p.getIdade() >= 18)
				.map(p -> p.getHobbys())
				.flatMap(l -> l.stream())
				.collect(toSet());
		

		assertThat(hobbys, hasSize(11));
		
	
	}


}
