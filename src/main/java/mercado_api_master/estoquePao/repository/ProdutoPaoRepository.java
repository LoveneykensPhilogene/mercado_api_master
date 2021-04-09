package mercado_api_master.estoquePao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mercado_api_master.estoquePao.model.ProdutoPao;

@Repository
public interface ProdutoPaoRepository extends JpaRepository<ProdutoPao,Long>{
	
}
