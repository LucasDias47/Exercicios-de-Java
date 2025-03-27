package Aula54Ex2;

public class Teste {

	public static void main(String [] args) {
		
		//Operacao es1 = Operacao.
		
		double num1 = 10;
		double num2 =5;
		
		for(Operacao op : Operacao.values()) {
			double resultado = op.calcular(num1, num2);
			System.out.println(num1 + " " + op.getSimbolo() + " " + num2 +" = " + resultado);
		}
	}
}
