package Aula72Ex1;

public class ProdutorConsumidor {

	public static void main(String[] args) {
		
		FilaCompartilhada fila = new FilaCompartilhada();
		Produtor produtor = new Produtor(fila);
		Consumidor consumidor = new Consumidor(fila);
		
		produtor.start();
		consumidor.start();

	}

}
