package Aula45Ex2;

public class Teste {

	public static void main(String[] args) {
		
		Veículo veiculo1 = new Carro();
		Veículo veiculo2 = new Moto();
		
		boolean eUmCarro = false;
		boolean eUmaMoto = false;
		
		System.out.println("Upcasting realizado para carro.");
		System.out.println("Upcasting realizado para moto.");
		
		System.out.println("É um carro?");
		if (veiculo1 instanceof Carro) {
			eUmCarro = true;
		}
		System.out.println(eUmCarro);
		
		Carro carro1 = (Carro) veiculo1;
		System.out.println("Downcasting realizado para carro.");
		
		carro1.acelerar();
		
		System.out.println("É uma moto?");
		if (veiculo2 instanceof Moto) {
			eUmaMoto = true;
		}
		System.out.println(eUmaMoto);
		
		Moto moto1 = (Moto) veiculo2;
		System.out.println("Downcasting realizado para moto.");
		
		moto1.acelerar();
		
		Carro carro2 = new Carro();
	
		
	}

}
