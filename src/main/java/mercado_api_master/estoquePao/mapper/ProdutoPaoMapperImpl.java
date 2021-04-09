package mercado_api_master.estoquePao.mapper;

import mercado_api_master.estoquePao.dto.ProdutoPaoDto;
import mercado_api_master.estoquePao.enums.TiposPaes;
import mercado_api_master.estoquePao.model.ProdutoPao;

    public class ProdutoPaoMapperImpl implements ProdutoPaoMapper{

	@Override
	public ProdutoPao createModelDto(ProdutoPaoDto produtoPaoDto) {
			
			ProdutoPao produtoPao= new ProdutoPao();
			//produtoPao.setId(produtoPaoDto.getId());
			produtoPao.setNome(produtoPaoDto.getNome());
			produtoPao.setMarca(produtoPaoDto.getMarca());
			produtoPao.setQtd(produtoPaoDto.getQtd());
			produtoPao.setMax(produtoPaoDto.getMax());
			TiposPaes tipo=TiposPaes.ALENTEJANO;
			produtoPaoDto.setTipo(tipo);
			produtoPao.setTipo(produtoPaoDto.getTipo());
			
			return produtoPao;
	}

	@Override
	public ProdutoPaoDto createModel(ProdutoPao produtoPao) {

		ProdutoPaoDto produtoPaoDto= new ProdutoPaoDto();
		 produtoPaoDto.setId(produtoPao.getId());
		 produtoPaoDto.setNome(produtoPao.getNome());
		 produtoPaoDto.setMarca(produtoPao.getMarca());
		 produtoPaoDto.setQtd(produtoPao.getQtd());
		 produtoPaoDto.setMax(produtoPao.getMax());
		 TiposPaes tipo=TiposPaes.ALENTEJANO;
		 produtoPao.setTipo(tipo);
		 produtoPaoDto.setTipo(produtoPao.getTipo());
		 
		return produtoPaoDto;
	}
	

}
