package br.com.javamagazine.stream.api;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.Test;

public class OptionalTypeTest extends BasicTest{

	
	
	@Test(expected=NoSuchElementException.class)
	public void test1() {
		
		Optional<Pessoa> primeiraPessoa = 
				pessoas.stream().filter(p -> p.nome.startsWith("W")).findFirst();
	
		primeiraPessoa.get();
	}
	

	
	
	public void test2() {
				
		Optional<Pessoa> primeiraPessoa = 
				pessoas.stream().filter(p -> p.nome.startsWith("A")).findFirst();
		
		assertThat(primeiraPessoa.isPresent(), equalTo(true));
	}
	
	
	
	public void test3() {
	
		Pessoa pessoa = new Pessoa(1, "x");
		
		if(pessoa != null){
			// alguma operação com o objeto
		}

		
		
	}

	
	
	
}
