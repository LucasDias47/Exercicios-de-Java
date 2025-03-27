package Aula54Ex4;

public class Notebook extends Dispositivo{

	private String sistemaOperacional;
	
	
	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public Notebook(String modelo) {
		super(modelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ligar() {
		return getModelo() +" foi ligado.";
		
	}
	
	@Override
	public String desligar() {
		return getModelo() +" foi ligado.";
		
	}

	void instalarSoftware() {
		System.out.println(getModelo() +" instalando software.");
	}
	
	

}
