package br.com.javamagazine.stream.api;

import static br.com.javamagazine.stream.api.Java7.getNumeroDePessoasMaiorDeIdade;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Java7Test extends BaseTest{

	@Test
	public void test() {
		 assertEquals(9, getNumeroDePessoasMaiorDeIdade(pessoas));
	}

}
