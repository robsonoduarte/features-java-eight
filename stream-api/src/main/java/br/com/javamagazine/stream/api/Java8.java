package br.com.javamagazine.stream.api;

import java.util.List;

public class Java8 {

	public static long getNumeroDePessoasMaiorDeIdade(List<Pessoa> pessoas) {
		
		return pessoas.stream()
				.filter(p -> p.idade >= 18)
				.count();
	}

}
