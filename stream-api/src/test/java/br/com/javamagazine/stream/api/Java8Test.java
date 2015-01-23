package br.com.javamagazine.stream.api;

import static br.com.javamagazine.stream.api.Java8.getAsCincoPrimeirasPessoasMaiorDeIdade;
import static br.com.javamagazine.stream.api.Java8.getNumeroDePessoasMaiorDeIdade;
import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class Java8Test {


	@Test
	public void test() {
		long numeroDePessoasMaiorDeIdade = getNumeroDePessoasMaiorDeIdade(getPessoas());
		assertThat(numeroDePessoasMaiorDeIdade, equalTo(9l));
	}




	@Test
	public void test2() {

		List<Pessoa> pessoas = getAsCincoPrimeirasPessoasMaiorDeIdade(getPessoas());

		assertThat(pessoas,hasItems(
						new Pessoa(18, 'M'),
						new Pessoa(20, 'M'),
						new Pessoa(22, 'M'),
						new Pessoa(50, 'M'),
						new Pessoa(88, 'M')
					)
			);
	}
















	// TODO: criar uma class helper ??
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
