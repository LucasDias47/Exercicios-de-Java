package Aula55Ex1;

public enum DiaSemana {

	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6);
	
	private int value;

	private DiaSemana(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	
	
	
}
