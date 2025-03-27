package Aula55Ex2;

public enum NivelAcesso {
	
	ADMIN(1), USUARIO(2), VISITANTE(3);
	
	private int value;

	private NivelAcesso(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	
	
	
	
	

	


}
