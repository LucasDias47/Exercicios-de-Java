package Aula60Ex1;

public enum Categoria {

	ECONOMICO(5000){
		
		
	},
	
	LUXO(20000){
		//@Override
		//public double calcularPrecoFinal(double precoBase, double custoAdicional) {
		//	return precoBase + custoAdicional;
		//}
	},
	
	SUV(150000){
		
	},
	
	ESPORTIVO(30000){
		
	},
	
	ELETRICO(10000){
		
	};

	
	
	private final double taxa;
	
	Categoria(double taxa){
	this.taxa = taxa;
	}
	
	public  double calcularPrecoFinal(double precoBase) {
		// TODO Auto-generated method stub
		return precoBase + (precoBase + taxa);
	}

	static Categoria valueOf() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
