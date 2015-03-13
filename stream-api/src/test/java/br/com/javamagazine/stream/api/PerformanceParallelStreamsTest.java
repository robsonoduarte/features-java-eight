
package br.com.javamagazine.stream.api;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PerformanceParallelStreamsTest extends BasicTest{
	
	

	private long startTime;
	private long finishTime;
	
	
	@Before
	public void setUp() throws Exception {
		startTime=0;
		finishTime=0;
	}
	
	
	
	
	@Test
	public void testPerformaceRunInParallelMode() {
		
		pessoas = generateVeryBigSizeList();
		
		setStarTime();
		List<Pessoa> idosos = 
				
				pessoas.stream()
				.parallel()
				.filter(p -> p.getIdade() >= 60)
				.collect(toList());
		
		
		setFinishTime();
		printTotalTimeOfExecution("Parallel");
		
		assertThat(idosos, hasSize(9999940));
	}
	
	
	
	
	
		
	




	@Test
	public void testPerformaceRunInSequentialMode() {
		
		pessoas = generateVeryBigSizeList();
		
		setStarTime();
		
		List<Pessoa> idosos = 
				pessoas.stream()
				.filter(p -> p.getIdade() >= 60)
				.collect(toList());
		
		
		setFinishTime();
		printTotalTimeOfExecution("Sequential");
		
		assertThat(idosos, hasSize(9999940));		
	}
	
	
	
	
	
	
	
	
	
	
	
	private List<Pessoa> generateVeryBigSizeList() {		
		List<Pessoa> pessoas = new ArrayList<>();
		
		for (int i = 0; i < 60000000; i++) {
			pessoas.add(new Pessoa(i, "nome"));
		}
		
		return pessoas;
	}
	
	
	
	private void setFinishTime() {
		finishTime = System.currentTimeMillis();
	}
	
	
	private void setStarTime() {
		startTime = System.currentTimeMillis();
	}
	
	private void printTotalTimeOfExecution(String mode) {
		System.out.println("The total time of execution in " + mode + " was..: " + ( finishTime - startTime) / 1000 + " seconds");		
	}
}
