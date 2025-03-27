package Aula71Ex3;

public enum StatusRede {
	
	CONECTADO{

		@Override
		public String descricao(String nome, String descricao) {
			// TODO Auto-generated method stub
			return "CONECTADO" + " - Dispositivo está ativo na rede. ";
		}
		
	}, DESCONECTADO {
		@Override
		public String descricao(String nome, String descricao) {
			// TODO Auto-generated method stub
			return "DESCONECTADO"+ " - Dispositivo não está na rede. ";
		}
	}, EM_ESPERA {
		@Override
		public String descricao(String nome, String descricao) {
			// TODO Auto-generated method stub
			return "EM_ESPERA" + " - Dispositivo aguardando conexão. ";
		}
	};

	
	private StatusRede() {
	}

	public abstract String descricao(String nome, String descricao);
	
}
