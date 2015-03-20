package br.com.javamagazine.stream.api;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.Test;

public class OptionalTypeTest extends BasicTest{

	
	
	@Test(expected=NoSuchElementException.class)
	public void testThrowNoSuchElementExceptionWhenHaventElement() {
		
		Optional<Pessoa> primeiraPessoa = 
				pessoas.stream().filter(p -> p.nome.startsWith("W")).findFirst();
	
		primeiraPessoa.get();			
	}
	

	
	@Test
	public void testIsPressentMethod() {
				
		Optional<Pessoa> primeiraPessoa = 
				pessoas.stream().filter(p -> p.nome.startsWith("A")).findFirst();
		
		assertThat(primeiraPessoa.isPresent(), equalTo(true));
	}
	
	
	
	@Test
	public void testIfPresentMethod() {
		
		
		Optional<Pessoa> primeiroMenorDeIdade = 
				pessoas.stream().filter(p -> p.idade < 18).findFirst();
		
		primeiroMenorDeIdade.ifPresent(p -> pessoas.remove(p));
		
		
		assertThat(pessoas, hasSize(14));
		
	}
	
	
	@Test
	public void testIfPresenteMethodWihtMethodReference() {
		
		
		Optional<Pessoa> primeiroMenorDeIdade = 
				pessoas.stream().filter(p -> p.idade < 18).findFirst();
		
		primeiroMenorDeIdade.ifPresent(pessoas::remove);
		
		assertThat(pessoas, hasSize(14));
		
	}
	
	
	@Test
	public void testMapMethod() {
		
		Optional<Pessoa> primeiroMenorDeIdade = 
				pessoas.stream().filter(p -> p.idade < 18).findFirst();
		
		Optional<Boolean> isRemovido = primeiroMenorDeIdade.map(pessoas::remove);
		
		assertThat(isRemovido.get(), equalTo(true));		
	}
	
	
	
	@Test
	public void testOrElseMethod() {
		
		Optional<Pessoa> opitional = 
				pessoas.stream().filter(p -> p.idade <= 1).findFirst();
		
		// caso não encontre... retorne uma pessoa com um ano de idade.
		Pessoa pessoa = opitional.orElse(new Pessoa(1, "Bebe", null));
		
		assertThat(pessoa.getIdade(), equalTo(1));
		
	}
}
