package Aula58Ex1;

public class CarroEletrico extends Carro implements Eletrico{

	public CarroEletrico(String marca, String modelo, double velocidadeAtual) {
		super(marca, modelo, velocidadeAtual);
		
	}

	
	
	@Override
	public String carregarBateria() {
		System.out.println(marca +" "+ modelo +" é elétrico. Carregando bateria...");
		return marca + modelo +"é elétrico. Carregando bateria...";
		
		
	}

	
}
