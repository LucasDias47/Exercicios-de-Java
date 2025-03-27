package Aula71Ex1;

public class Teste {

	public static void main(String[] args) {
		
		int []array = {1,2,3,4,5,6};
		
		ThreadContador t1 = new ThreadContador("1",array);
		ThreadContador t2 = new ThreadContador("2",array);
		ThreadContador t3 = new ThreadContador("3",array);
		ThreadContador t4 = new ThreadContador("4",array);
		ThreadContador t5 = new ThreadContador("5",array);
		ThreadContador t6 = new ThreadContador("6",array);
		

	}

}
