package mercado_api_master.estoquePao.mapper;

import javax.persistence.MappedSuperclass;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.core.convert.converter.Converter;

import mercado_api_master.estoquePao.dto.ProdutoPaoDto;
import mercado_api_master.estoquePao.model.ProdutoPao;


@Mapper
public interface ProdutoPaoMapper {
	
	ProdutoPaoMapper INSTANCE = Mappers.getMapper(ProdutoPaoMapper.class);
	@Mapping(target = "")
	ProdutoPao createModelDto(ProdutoPaoDto produtoPãoDto);
	@Mapping(target = "")
	ProdutoPaoDto createModel(ProdutoPao produtoPao);
	

}
