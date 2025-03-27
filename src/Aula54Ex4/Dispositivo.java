package Aula54Ex4;

public class Dispositivo implements Ligavel,Desligavel {

	private String modelo;

	public Dispositivo(String modelo) {
		super();
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String desligar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ligar() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isLigado() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
