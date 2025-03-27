package Aula46Ex2;

public class Moto implements Veiculo{
	
	private String modelo;
	private String cilindrada;
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	@Override
	public void exibirInfo() {
		System.out.println("Moto: Modelo - " +getModelo() + " Cilindrada "+ getCilindrada());
		
	}
	
	
}
