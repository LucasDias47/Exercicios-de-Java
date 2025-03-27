package Aula53Ex3;

public class Desenvolvedor extends Funcionario{
	
	@Override
	
	double calcularBonus() {
		
		return setBonus(getSalario()*10/100);
		
	}

}
