package Aula62Ex3;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(media(5.0, 10.0, 15.0));
		System.out.println(media(7.5,8.5,9.5,10.5));
		System.out.println(media());
		
	}
	
	static double media(double...med) {
		
		double tot =0;
		double f = 0;
		
		for(int i =0; i<med.length;i++) {
			
			tot += med[i];
			f = tot/med.length;
		}
		
		
		return f;
	}

}
