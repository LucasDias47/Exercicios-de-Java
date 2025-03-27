package Aula54Ex2;

public enum Operacao {
	
	ADICAO('+'){
		@Override
		public double calcular(double a, double b) {
			return a + b;
		}
	}, 
	
	
	
	SUBTRACAO('-'){
		@Override
		public double calcular(double a, double b) {
			return a - b;
		}
	}, 
	
	MULTIPLICACAO('*'){
		@Override
		public double calcular(double a, double b) {
			return a * b;
		}
	}, 
	
	DIVISAO('/'){
		@Override
		public double calcular(double a, double b) {
			if(b==0) {
				throw new ArithmeticException("Divisão por zero não é permitida!");
			}
			return a/b;
		}
	};
	
	private char simbolo;
	
	public char getSimbolo() {
		return simbolo;
	}


	public double calcular(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}


	private Operacao(char simbolo) {
		this.simbolo = simbolo;
	}
	
	/*
	
	void expressao() {

		double num1 = 10, num2 = 5;
		
		Operacao soma = Operacao.ADICAO;
		Operacao subtracao = Operacao.SUBTRACAO;
		Operacao multiplicao = Operacao.MULTIPLICACAO;
		Operacao divisao = Operacao.DIVISAO;
		
		Operacao[] ops = Operacao.values();
		
		for(Operacao i : ops) {
			
			if(i == soma) {
				System.out.println(num1 + soma.getSimbolo() + num2 );
			}
			
			else if(i == subtracao) {
				System.out.println(num1 + subtracao.getSimbolo() + num2 );
			}
		}
		*/
	}
	
	
	
	


