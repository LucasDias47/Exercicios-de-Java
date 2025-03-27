package Aula46Ex2;

public class Teste {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Moto moto1 = new Moto();
		
		carro1.setMarca("Toyota");
		carro1.setAno("2020");
		
		moto1.setModelo("CG 160");
		moto1.setCilindrada("160cc");
		
		Veiculo veiculos[] = new Veiculo[2];
		
		veiculos[0] = carro1;
		veiculos[1] = moto1;
		
		for(int i = 0; i<veiculos.length ;i++) {
			veiculos[i].exibirInfo();
			
		}
		
		

	}

}
