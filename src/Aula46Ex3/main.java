package Aula46Ex3;

public class main {

	public static void main(String[] args) {
		
		
		Carro carro1 = new Carro(0);
		Barco barco1 = new Barco(0);
		CarroAnfibio carroAn1 = new CarroAnfibio(0);
		
		Veiculo veiculos[] = new Veiculo[3];
		
		veiculos[0] = carro1;
		veiculos[1] = barco1;
		veiculos[2] = carroAn1;
		
		//corrigido
		
		/*
		for(Veiculo v : veiculos) {
			if (v instanceof Automovel) {
				((Automovel)v).acelerar();
			}
		}
		
		for(Veiculo v : veiculos) {
			if(v instanceof Carro ) {
				((Carro)v).exibir();
			}
			
			else if(v instanceof Barco ) {
				((Barco)v).exibir();
			}
			
			if(v instanceof Aquatico) {
				((Aquatico)v).flutuar();
			}
			
			
		}
		*/
		
		for(int i = 0; i<veiculos.length; i++) {
			if(veiculos[i] instanceof Automovel) {
				((Automovel) veiculos[i]).acelerar();
				
			}
	
		}
		
		
		
		
		for(int i = 0; i<veiculos.length; i++) {
				if(veiculos[i] instanceof Carro) {
					((Carro) veiculos[i]).exibir();
					
				}
				
				else if(veiculos[i] instanceof Barco) {
					((Barco) veiculos[i]).exibir();
					
				}
				
			    if (veiculos[i] instanceof Aquatico)  {
					((Aquatico) veiculos[i]).flutuar();
					
				}
		}	
			
			
		
		
		
			
			
			
			
			//((Carro) veiculos[i]).exibir();
			//((Barco) veiculos[i]).exibir();
			//((Barco) veiculos[i]).flutuar();
			//((CarroAnfibio) veiculos[i]).exibir()
	
	
	}
}
