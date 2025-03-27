package Aula62Ex1;

public class Teste {
	
	public static void main (String args[]) {
		
		System.out.println(soma(1,2,3));
		System.out.println(soma(10,20,30,40));
		System.out.println(soma(5,5,5,5,5));
	}
	
	static int soma (int... num) {
		
		//int vetor[]= {1,2,3};
		
		int total = 0;
		
		for(int i = 0;i<num.length;i++) {
			total  += num[i];
		}
		
		return total;
		
	}

}
