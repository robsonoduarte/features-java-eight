package br.com.javamagazine.stream.api;

import static java.util.stream.Collectors.toList;

import java.util.List;

public class Java8 {

	public static long getNumeroDePessoasMaiorDeIdade(List<Pessoa> pessoas){
		return pessoas.stream()
				.filter(p -> p.idade >= 18)
				.count();
	}



	public static List<Pessoa> getAsCincoPrimeirasPessoasMaiorDeIdade(List<Pessoa> pessoas){
		return pessoas.stream()
				.filter(p -> p.idade >= 18)
				.peek(p -> System.out.println(p))
				.limit(5)
				.collect(toList());
	}

}
