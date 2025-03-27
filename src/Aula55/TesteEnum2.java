package Aula55;


public class TesteEnum2 {

	public static void main(String[] args) {
		
		DiaSemana dia;
		
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		
		DiaSemana dia1 = Enum.valueOf(DiaSemana.class, "DOMINGO");
		
		System.out.println(dia1);
	}

}
