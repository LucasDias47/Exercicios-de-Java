package Aula65;

@interface informacaoAula {
	
	String autor();
	
	int aulaNumero();
	
	String blog() default "vader.com";
	
	String site()default "vader.darkside.com";
}
