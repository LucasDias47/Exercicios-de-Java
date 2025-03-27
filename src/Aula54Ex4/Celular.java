package Aula54Ex4;

public class Celular extends Dispositivo{

	private int bateria;
	
	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public Celular(String modelo) {
		super(modelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ligar() {
		return getModelo() +" foi ligado.";
	
	}
	@Override
	public String desligar() {
		return getModelo() +" foi desligado.";
		
	}
	
	void carregarBateria() {
		System.out.println(getModelo() +" carregando bateria.");
	}

	
	
	
	

	
}
