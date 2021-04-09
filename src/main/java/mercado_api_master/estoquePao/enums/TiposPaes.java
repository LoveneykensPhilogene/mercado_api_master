package mercado_api_master.estoquePao.enums;

public enum TiposPaes {
	
	CENTEIO("centeio"),
	MARRAQUETA("marraqueta"),
	HALLULA("hallula"),
	ALENTEJANO("alentejano"),
	PRETO("preto"),
	AUSTRALIANO("australiano"),
	CIABATTA("ciabatta");
	
	private String descripcao;

	TiposPaes(String string) {
		this.descripcao=string;
	}
	
	public String getDescripcao() {
		return descripcao;
	}

	

}
