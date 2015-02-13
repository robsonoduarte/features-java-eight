package br.com.javamagazine.stream.api;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

public class SimpleReductions extends BasicTest{


	
	@Test
	public void test() {
		
		List<Pessoa> pessoas = getPessoas();
		
		Optional<Pessoa> pessoa = 
				pessoas.stream().max(Comparator.comparing(p -> p.idade));

		assertThat(pessoa.get().idade, equalTo(88));
		
	}
	
	
	
	@Test
	public void test1() {
		
		List<Pessoa> pessoas = getPessoas();
		
		Optional<Pessoa> pessoa = 
				pessoas.stream().min(Comparator.comparing(p -> p.idade));
		
		assertThat(pessoa.get().idade, equalTo(1));	
	}

	
}
