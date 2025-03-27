package Aula58Ex1;

public class Automovel {
	
	String marca;
	String modelo;
	
	double velocidadeAtual;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	
	public Automovel(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadeAtual = velocidadeAtual;
		
	}
	@Override
	public String toString() {
		return "Carro: Marca=" + marca + ", Modelo=" + modelo + ", VelocidadeAtual=" + velocidadeAtual + "km/h";
	}
	
	
	
	

}
