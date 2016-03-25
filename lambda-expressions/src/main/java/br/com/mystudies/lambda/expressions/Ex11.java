package br.com.mystudies.lambda.expressions;

public class Ex11 {



	public static void main(String[] args){
	}



	

	interface I{
		default void f(){};
		//void f(); // ok no compilation problems
	}



	interface J{
		//default void f(){}; // compilation problems because conflict methods
		//static void f(){};
		void f(); 
	}




	


	
	
	
	class R implements I{
		@Override
		public void f() {
			I.super.f();
		}
		
	}
	
	
	
	
	
	class S extends R implements J{
		@Override
		public void f() {}	
	}
	
	
	
	
	

}
