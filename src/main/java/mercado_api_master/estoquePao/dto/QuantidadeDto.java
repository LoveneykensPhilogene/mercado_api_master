package mercado_api_master.estoquePao.dto;

import javax.validation.constraints.Max;

import com.sun.istack.NotNull;

public class QuantidadeDto {
	
    @NotNull
    @Max(100)
    private Integer qtd;
    
    QuantidadeDto(){}
    
    QuantidadeDto(int qtd){
    	this.qtd=qtd;
    }

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	

}
