package br.com.javamagazine.stream.api;

import java.util.List;

public class Java7 {

	public static long getNumeroDePessoasMaiorDeIdade(List<Pessoa> pessoas) {

		long count = 0;

		for (Pessoa pessoa : pessoas) {
			if(pessoa.idade >= 18){
				count++;
			}
		}
		return count;
	}

}
