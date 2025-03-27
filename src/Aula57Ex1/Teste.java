package Aula57Ex1;

public class Teste {

	public static void main(String[] args) {
		
		int num1 = 10;
		double num2 = 5.75;
		boolean tr = true;
		
		int num = Integer.valueOf(10);
		num2 = Double.valueOf(5.75);
		tr  = Boolean.valueOf(tr);
		Integer outNum = 10;
		//boolean comp = numWrapper.equals(outNum);
		
		System.out.println("Valor inteiro: "+ num);
		System.out.println("Valor double: "+ num2);
		System.out.println("Valor booleano: "+ tr);
		System.out.println("String do inteiro: "+ num);
		System.out.println("");

	}

}
