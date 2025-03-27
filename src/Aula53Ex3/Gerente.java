package Aula53Ex3;

public class Gerente extends Funcionario{
	
	@Override
	
	double calcularBonus() {
		return setBonus(getSalario()*20/100);
	}

}
