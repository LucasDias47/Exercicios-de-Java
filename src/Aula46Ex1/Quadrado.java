package Aula46Ex1;

public class Quadrado extends Figura2D implements DimensaoSuperficial {

	private int lado;
	
	
	private double area;
	
	
	
	public int getLado() {
		return lado;
	}


	public void setLado(int lado) {
		this.lado = lado;
	}


	
	
	
	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	
	
	@Override
	public double calcularArea() {
		return lado * lado;
		
	}

}
