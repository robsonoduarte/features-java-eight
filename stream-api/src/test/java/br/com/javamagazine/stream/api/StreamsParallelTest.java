package br.com.javamagazine.stream.api;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

public class StreamsParallelTest extends BasicTest{

	
	
	@Test
	public void testExecutionPipeLineInParallel() {
		
		Long numeroDePessoasIdosas = 
				pessoas.stream()
					.parallel()
					.filter(p -> p.getIdade() > 65)
					.count();
			
		assertThat(numeroDePessoasIdosas, equalTo(1L));
	}
	
	
	
	
	
	int numeroDeIdosos = 0;
	
	@Test
	public void testRaceCondition() {
		
		pessoas = generateBigSizeList();
		
		pessoas.stream()
			.parallel()
			.forEach( p -> {
				if(p.getIdade() >= 60){
					numeroDeIdosos++;
				}
			});
		

		assertThat(numeroDeIdosos, not(equalTo(999940)));
	}
	
	
	
	
	AtomicInteger atomicNumeroDeIdodos = new AtomicInteger();
	
	
	@Test
	public void testThreadSafeExecution() {
		
		pessoas = generateBigSizeList();
		
		pessoas.stream()
			.parallel()
			.forEach( p -> {
				if(p.getIdade() >= 60){
				atomicNumeroDeIdodos.getAndAdd(1);
			}
		});
		
		
		assertThat(atomicNumeroDeIdodos.get(), equalTo(999940));
	}
	
	
	
	private List<Pessoa> generateBigSizeList() {
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		for (int i = 0; i < 1000000; i++) {
			pessoas.add(new Pessoa(i, "nome"));
		}	
		return pessoas;
	}

	
}
