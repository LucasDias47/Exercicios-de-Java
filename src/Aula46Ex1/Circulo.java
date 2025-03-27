package Aula46Ex1;

public class Circulo extends Figura2D implements DimensaoSuperficial{
	
	private double raio;
	
	

	public double getRaio() {
		return raio;
	}



	public void setRaio(double raio) {
		this.raio = raio;
	}

	//double raio2 = 6;



	@Override
	public double calcularArea() {
		
		return (raio * raio) * 3.14;
		
	}
	
	
	/*
	@Override
	public void calcularArea() {
		
		setRaio(Math.PI * Math.pow(raio, 2));
		
	}
	*/
}
