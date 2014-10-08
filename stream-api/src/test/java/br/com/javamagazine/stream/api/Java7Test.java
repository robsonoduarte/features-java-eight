package br.com.javamagazine.stream.api;

import static br.com.javamagazine.stream.api.Java7.getNumeroDePessoasMaiorDeIdade;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.javamagazine.stream.api.Java7;
import br.com.javamagazine.stream.api.Pessoa;

public class Java7Test {

	private Java7 java7Impl;




	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	
	
	@Test
	public void test() {
		 assertEquals(9, getNumeroDePessoasMaiorDeIdade(getPessoas()));
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// TODO: criar um help...
	private List<Pessoa> getPessoas() {
		return asList(
				new Pessoa(18, 'M'),
	 			new Pessoa(10, 'M'),
	 			new Pessoa(11, 'M'),
	 			new Pessoa(20, 'M'),
	 			new Pessoa(22, 'M'),
	 			new Pessoa(50, 'M'),
	 			new Pessoa(12, 'M'),
	 			new Pessoa(88, 'M'),
	 			new Pessoa(26, 'M'),
	 			new Pessoa(38, 'M'),
	 			new Pessoa(29, 'M'),
	 			new Pessoa(39, 'M'),
	 			new Pessoa(9, 'M'),
	 			new Pessoa(1, 'M'),
	 			new Pessoa(3, 'M')
			);
	}

	
	
}
