package Aula44Ex3;

public class Pessoa implements Trabalhador, Estudante, Atleta{

	@Override
	public void treinar() {
		
		System.out.println("A pessoa está treinando para a maratona");
	}

	@Override
	public void estudar() {
		
		System.out.println("A pessoa está estudando para a prova");
	}

	@Override
	public void trabalhar() {
		System.out.println("A pessoa está trabalhando no escritório");
	}

}
