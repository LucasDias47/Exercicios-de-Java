package Aula71Ex3;

public class Smartphone extends Dispositivo{


	@Override
	public boolean ligar(boolean on) {
		System.out.println("[Smartphone] Ligando...");
		on = true;
		return on = true;
	}

	@Override
	public boolean desligar(boolean on) {
		System.out.println("[Smartphone] Desligando...");
		on = false;
		return on = false;
	}

	@Override
	public void conectar() {
		System.out.println("[Smartphone] Conectando à rede...");
		
	}
	
	public void tirarFoto() {
		System.out.println("[Smartphone] Tirando foto...");
	}
}
