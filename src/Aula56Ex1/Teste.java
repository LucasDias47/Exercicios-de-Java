package Aula56Ex1;

public class Teste {

	public static void main(String[] args) {
		
		double a = 10, b = 2;
		
		System.out.println("Soma: "+ OperacaoMatematica.SOMA.calcular(a, b));
		System.out.println("Subtração: " + OperacaoMatematica.SUBTRACAO.calcular(a, b));
		System.out.println("Multiplicação: "+ OperacaoMatematica.MULTIPLICACAO.calcular(a, b));
		System.out.println("Divisão: " + OperacaoMatematica.DIVISAO.calcular(a, b));

	}

}
