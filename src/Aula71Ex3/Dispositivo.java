package Aula71Ex3;

public class Dispositivo implements Conectavel, Controlavel{

	private String nome;
	private StatusRede status;
	
	
	
	public StatusRede getStatus() {
		return status;
	}

	public void setStatus(StatusRede status) {
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	


	@Override
	public void conectar() {
		System.out.println("Conectando à rede...");
		
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		
	}
	
	public void exibirStatus(){
		
	}

	
	public boolean ligar(boolean on) {
		return on;
		// TODO Auto-generated method stub
		
	}


	public boolean desligar(boolean on) {
		return on;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		
	}
	

}
