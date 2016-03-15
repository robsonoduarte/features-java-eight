package br.com.mystudies.lambda.expressions;

public class Ex7 {



	public static void main(String[] args){
		run(andThen(
				() -> print("running r1"),
				() -> print("running r2")
			));

	}























	private static void run(Runnable runnable) {
		new Thread(runnable).start();
	}



	private static Runnable andThen(Runnable r1, Runnable r2) {
		return () -> {
			r1.run();
			r2.run();
		};
	}





























	private static void print(String msg) {
		System.out.println(msg);
	}


}
