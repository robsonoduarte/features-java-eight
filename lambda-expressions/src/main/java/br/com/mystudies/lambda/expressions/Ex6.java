package br.com.mystudies.lambda.expressions;

public class Ex6 {






	public static void main(String[] args) throws Exception {
		new Thread(uncheck(() ->{
			System.out.println("Zzz");
			Thread.sleep(1000);
		}));

	}










	private static Runnable uncheck(RunnableEx runnableEx){
		return () -> {
			try {
				runnableEx.run();
			} catch (Exception e) {
			}
		};
	}









	public interface RunnableEx{
		void run() throws Exception;
	}





}
