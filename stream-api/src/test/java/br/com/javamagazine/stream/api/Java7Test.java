package br.com.javamagazine.stream.api;

import static br.com.javamagazine.stream.api.Java7.getNumeroDePessoasMaiorDeIdade;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Java7Test extends BasicTest{

	@Test
	public void test() {
		 assertEquals(9, getNumeroDePessoasMaiorDeIdade(getPessoas()));
	}

}
