package mercado_api_master.estoquePao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.sun.istack.NotNull;

import mercado_api_master.estoquePao.enums.TiposPaes;

@Entity
public class ProdutoPao {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE) 
	private Long id;
	
   @Column(nullable = false, unique = true)
	private String nome;
	
	@Column(nullable = false, unique = true)
	private String marca;
	
	@Column(nullable = false)
	private int qtd;
	
	@Column(nullable = false)
	private int max;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TiposPaes tipo;
	
	public ProdutoPao() {}	
	
	public ProdutoPao(String nome,String marca,TiposPaes tipo) {
		this.nome=nome;
		this.marca=marca;
		this.tipo=tipo;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getQtd() {
		return qtd;
	}

	public int getMax() {
		return max;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public TiposPaes getTipo() {
		return tipo;
	}

	public void setTipo(TiposPaes tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoPao other = (ProdutoPao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
