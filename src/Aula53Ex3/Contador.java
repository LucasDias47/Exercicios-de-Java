package Aula53Ex3;

public class Contador extends Funcionario{
	
	@Override
	
	double calcularBonus() {
		return setBonus(getSalario()*20/100);
	}

}
