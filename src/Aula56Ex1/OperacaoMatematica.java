package Aula56Ex1;

public enum OperacaoMatematica {
	

	
	SOMA{
		@Override
		public double calcular(double a, double b) {
			return a + b;
		}
	},
	
	SUBTRACAO{
		@Override
		public double calcular(double a, double b) {
			return a - b;
		}
	},
	
	MULTIPLICACAO{
		@Override
		public double calcular(double a, double b) {
			return a * b;
		}
	},
	
	DIVISAO{
		@Override
		public double calcular(double a, double b) {
			return a / b;
		}
	};
	
	
	public abstract double calcular(double a,double b);
}
