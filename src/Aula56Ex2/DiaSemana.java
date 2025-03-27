package Aula56Ex2;

public enum DiaSemana {

	DOMINGO{
		@Override
		public String tipoDia(String tipo) {
			return "Final de semana";
		}
		
	},
	
	SEGUNDA{
		@Override
		public String tipoDia(String tipo) {
			return "Dia Útil";
		}
	},
	
	TERCA{
		@Override
		public String tipoDia(String tipo) {
			return "Dia Útil";
		}
	},
	
	QUARTA{
		@Override
		public String tipoDia(String tipo) {
			return "Dia Útil";
		}
	},
	
	QUINTA{
		@Override
		public String tipoDia(String tipo) {
			return "Dia Útil";
		}
	},
	
	SEXTA{
		@Override
		public String tipoDia(String tipo) {
			return "Dia Útil";
		}
	},
	SABADO{
		@Override
		public String tipoDia(String tipo) {
			return "Final de Semana";
		}
	};
	
	
	public abstract String tipoDia(String tipo);
	
}
