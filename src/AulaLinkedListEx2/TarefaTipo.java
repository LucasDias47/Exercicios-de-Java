package AulaLinkedListEx2;

public enum TarefaTipo {
	
	BAIXA(5), MEDIA(3), ALTA(1);
	
	private final int tempoExecucao;

	TarefaTipo(int tempoExecucao) {
		this.tempoExecucao = tempoExecucao;
		
	}

	public int getTempoExecucao() {
		return tempoExecucao;
	}
	
	

}
