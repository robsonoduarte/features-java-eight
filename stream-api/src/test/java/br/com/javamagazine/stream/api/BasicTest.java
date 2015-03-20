package br.com.javamagazine.stream.api;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

public class BasicTest {


	protected List<Pessoa> pessoas;
	
	
	@Before
	public void setUp() throws Exception {
		pessoas = getPessoas();
	}


	
	
	
	
	
	

	private List<Pessoa> getPessoas() {
		return new ArrayList<>(asList(
						new Pessoa(18,"Pedro", asList("Cimena", "Shopping")),
			 			new Pessoa(10,"Maria", asList("Cartoon", "Brincar")),
			 			new Pessoa(11,"Joao", asList("Videogame", "Bicicleta")),
			 			new Pessoa(20,"Antonio", asList("Cimena", "Dançar")),
			 			new Pessoa(22,"Ana", asList("Namorar", "Dançar")),
			 			new Pessoa(50,"Guilherme", asList("Pescar", "Filhos")),
			 			new Pessoa(12,"Gustavo", asList("Videogame", "Bicicleta")),
			 			new Pessoa(88,"Alexandre", asList("Domino", "Baralho")),
			 			new Pessoa(26,"Peterson", asList("Cimena", "Dançar")),
			 			new Pessoa(38,"Daniel", asList("Estudar", "TV")),
			 			new Pessoa(29,"Giovana", asList("Namorar", "Dançar")),
			 			new Pessoa(39,"Sidney", asList("Pescar", "Cerveja")),
			 			new Pessoa(9,"Everaldo", asList("Brincar")),
			 			new Pessoa(1,"Julio"),
			 			new Pessoa(3,"Marco"))
				);
	}

}
