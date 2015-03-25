package br.com.javamagazine.stream.api;

import static br.com.javamagazine.stream.api.Java8.getAsCincoPrimeirasPessoasMaiorDeIdade;
import static br.com.javamagazine.stream.api.Java8.getNumeroDePessoasMaiorDeIdade;
import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class Java8Test extends BaseTest{


	@Test
	public void test() {
		long numeroDePessoasMaiorDeIdade = getNumeroDePessoasMaiorDeIdade(pessoas);
		assertThat(numeroDePessoasMaiorDeIdade, equalTo(9l));
	}



	

	@Test
	public void test2() {

		List<Pessoa> pessoasMaioresDeIdade = getAsCincoPrimeirasPessoasMaiorDeIdade(pessoas);

		assertThat(pessoasMaioresDeIdade,hasItems(
					new Pessoa(18,"Pedro", asList("Cimena", "Shopping")),
					new Pessoa(20,"Antonio", asList("Cimena", "Dançar")),
					new Pessoa(22,"Ana", asList("Namorar", "Dançar")),
					new Pessoa(50,"Guilherme", asList("Pescar", "Filhos")),
					new Pessoa(88,"Alexandre", asList("Domino", "Baralho"))
				));
		
		

	}
}
