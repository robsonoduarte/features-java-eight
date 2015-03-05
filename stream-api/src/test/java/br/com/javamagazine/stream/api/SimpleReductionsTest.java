package br.com.javamagazine.stream.api;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Comparator;
import java.util.Optional;

import org.junit.Test;

public class SimpleReductionsTest extends BasicTest{


	
	@Test
	public void test1() {
		
		Optional<Pessoa> pessoaMaisVelha = 
				pessoas.stream().max(Comparator.comparing(p -> p.idade));
		
		assertThat(pessoaMaisVelha.get().idade, equalTo(88));	
	}
	
	
	
	@Test
	public void test2() {
		
		Optional<Pessoa> pessoaMaisNova = 
				pessoas.stream().min(Comparator.comparing(p -> p.idade));
		
		assertThat(pessoaMaisNova.get().idade, equalTo(1));	
	}
	
	
	
	
	@Test
	public void test3() {
				
		Optional<Pessoa> pessoa = 
				pessoas.stream().filter(p -> p.nome.startsWith("A")).findFirst();
		
		assertThat(pessoa.get().nome, equalTo("Antonio"));
	}

	
}
