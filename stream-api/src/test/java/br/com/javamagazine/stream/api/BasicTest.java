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
						new Pessoa(18,"Pedro"),
			 			new Pessoa(10,"Maria"),
			 			new Pessoa(11,"Joao"),
			 			new Pessoa(20,"Antonio"),
			 			new Pessoa(22,"Ana"),
			 			new Pessoa(50,"Guilherme"),
			 			new Pessoa(12,"Gustavo"),
			 			new Pessoa(88,"Alexandre"),
			 			new Pessoa(26,"Peterson"),
			 			new Pessoa(38,"Daniel"),
			 			new Pessoa(29,"Giovana"),
			 			new Pessoa(39,"Sidney"),
			 			new Pessoa(9,"Everaldo"),
			 			new Pessoa(1,"Julio"),
			 			new Pessoa(3,"Marco"))
				);
	}

}
