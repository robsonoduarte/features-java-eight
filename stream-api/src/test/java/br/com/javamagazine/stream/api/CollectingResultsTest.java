package br.com.javamagazine.stream.api;

import static org.hamcrest.Matchers.arrayWithSize;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;

public class CollectingResultsTest extends BasicTest{

		
	@Test
	public void test() {
				
		Pessoa[] pessoasMaiorDeIdade = 
				pessoas.stream().filter(p -> p.idade >=18 ).toArray(Pessoa[]::new);
		
		assertThat(pessoasMaiorDeIdade, arrayWithSize(9));
		
	}
	
	
	@Test
	public void test2() {
		
		Set<Pessoa> pessoasMaiorDeIdade = 
				pessoas.stream().filter(p -> p.idade >=18 ).collect(Collectors.toSet());
		
		assertThat(pessoasMaiorDeIdade, hasSize(9));
		
	}
	
	@Test
	public void test3() {
	
		ArrayList<Pessoa> pessoasMaiorDeIdade = 
						pessoas.stream().filter(p -> p.idade >=18 ).collect(Collectors.toCollection(ArrayList::new));
		
		assertThat(pessoasMaiorDeIdade, hasSize(9));
	}
	
	
	@Test
	public void test4() {
		
		Map<Integer, Pessoa> map = 
				pessoas.stream().filter(p -> p.idade <18 ).collect(Collectors.toMap(p -> p.getIdade(), p -> p ));
		
		System.out.println(map);
		
	}
	
	
}
