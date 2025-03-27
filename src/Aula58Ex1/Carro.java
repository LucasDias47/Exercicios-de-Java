package Aula58Ex1;

import java.util.Random;

public class Carro extends Automovel implements Veiculo{

	public Carro(String marca, String modelo, double velocidadeAtual) {
		super(marca, modelo );
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void acelerar() {
		
		Random random = new Random();
		double acc= random.nextDouble(100,200);
		double accF =Math.round(acc*100)/100;
		
		System.out.println("Tentando acelerar");
		setVelocidadeAtual(accF);
		System.out.println("Velocidade atual subiu para "+getVelocidadeAtual()+ "km/h");
		
	}

	@Override
	public void frear() {
		// TODO Auto-generated method stub
		
	}

}
