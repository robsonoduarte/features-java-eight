package br.com.javamagazine.stream.api;

import static br.com.javamagazine.stream.api.Java8.getAsCincoPrimeirasPessoasMaiorDeIdade;
import static br.com.javamagazine.stream.api.Java8.getNumeroDePessoasMaiorDeIdade;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class Java8Test extends BasicTest{


	@Test
	public void test() {
		long numeroDePessoasMaiorDeIdade = getNumeroDePessoasMaiorDeIdade(getPessoas());
		assertThat(numeroDePessoasMaiorDeIdade, equalTo(9l));
	}




	@Test
	public void test2() {

		List<Pessoa> pessoas = getAsCincoPrimeirasPessoasMaiorDeIdade(getPessoas());

		assertThat(pessoas,hasItems(
						new Pessoa(18,"Pedro"),
						new Pessoa(20,"Antonio"),
						new Pessoa(22,"Ana"),
						new Pessoa(50,"Guilherme"),
						new Pessoa(88,"Alexandre")
					)
			);
	}
}
