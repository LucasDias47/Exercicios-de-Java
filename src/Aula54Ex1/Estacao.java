package Aula54Ex1;

public enum Estacao {
	
	PRIMAVERA(20), VERAO(30), OUTONO(15) , INVERNO(5);
	
	private double temperaturaMédia;

	private Estacao(double temperaturaMédia) {
		this.temperaturaMédia = temperaturaMédia;
	}
	
	void descricao(){
		
		System.out.println(this.name() + " Temperatura média: "+temperaturaMédia +"°C");
	}
	
	
	
	

}
