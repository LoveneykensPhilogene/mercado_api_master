package mercado_api_master.estoquePao.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

import mercado_api_master.estoquePao.enums.TiposPaes;
import mercado_api_master.estoquePao.model.ProdutoPao;

public class ProdutoPaoDto {
	
	@NotNull
	private long id;
	
	@NotNull
	@Size(min = 1, max = 200)
	private String nome;
	
	@NotNull
	@Size(min = 1, max = 200)
	private String marca;
	
    @NotNull
	@Max(500)
	private int max;
	
	@NotNull
	@Max(100)
	private int qtd;
	

	@Enumerated(EnumType.STRING)
	@NotNull
	private TiposPaes tipo;
	
	public ProdutoPaoDto() {}
	
	public ProdutoPaoDto(String nome,String marca,int qtd,int max,TiposPaes tipo) {
		this.nome=nome;
		this.marca=marca;
		this.max=max;
		this.qtd=qtd;
		this.tipo=tipo;
	}
	
	public ProdutoPaoDto(ProdutoPao produtoPao) {
		this.id=produtoPao.getId();
		this.nome=produtoPao.getNome();
		this.marca=produtoPao.getMarca();
	}
		
	public long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
		public String getMarca() {
		return marca;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public TiposPaes getTipo() {
		return tipo;
	}

	public void setTipo(TiposPaes tipo) {
		this.tipo = tipo;
	}

}
