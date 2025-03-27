package Aula71Ex3;

public class SmartTv extends Dispositivo{


	@Override
	public void ligar() {
		System.out.println("[SmartTV] Ligando...");
		
	}

	@Override
	public void desligar() {
		System.out.println("[SmartTV] Desligando...");
		
	}

	@Override
	public void conectar() {
		System.out.println("[SmartTV] Conectando à rede...");
		
	}
	
	public void mudarCanal(int canal) {
		System.out.println("[SmartTV] Mudando para o canal "+canal+"...");
	}
	
}
