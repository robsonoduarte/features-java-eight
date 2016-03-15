package br.com.mystudies.lambda.expressions;

public class Ex5 {


	public static void main(String[] args) throws Exception {

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Running...");
			}
		}).start();


		new Thread(() -> System.out.println("Running...")).start();
	}


}
