package mercado_api_master.estoquePao.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mercado_api_master.estoquePao.dto.ProdutoPaoDto;
import mercado_api_master.estoquePao.exception.EstoqueProdutoPaoException;
import mercado_api_master.estoquePao.exception.ProdutoPaoAlreadyRegisteredException;
import mercado_api_master.estoquePao.exception.ProdutoPaoNotFoundException;
import mercado_api_master.estoquePao.mapper.ProdutoPaoMapperImpl;
import mercado_api_master.estoquePao.model.ProdutoPao;
import mercado_api_master.estoquePao.repository.ProdutoPaoRepository;

    @Service
public class ProdutoPaoService {
	
	@Autowired
	private ProdutoPaoRepository produtoPaoRepository;

	
	public ProdutoPaoDto createDto(ProdutoPaoDto produtoPaoDto) throws ProdutoPaoAlreadyRegisteredException{
		
		ProdutoPaoMapperImpl produtoPaoMapperImpl=new ProdutoPaoMapperImpl();
		 ProdutoPao dtoMapper=produtoPaoMapperImpl.createModelDto(produtoPaoDto);
		 ProdutoPao saveProdutoPao=produtoPaoRepository.save(dtoMapper);
		 ProdutoPaoDto produtoMapperDto=produtoPaoMapperImpl.createModel(saveProdutoPao);
		 
		 return produtoMapperDto;
		 
	}
	
	public List<ProdutoPaoDto> findAllPao()  throws ProdutoPaoNotFoundException{
		
		ProdutoPaoMapperImpl produtoPaoMapperImpl=new ProdutoPaoMapperImpl();
		List<ProdutoPao> produtoPao=produtoPaoRepository.findAll();
		List<ProdutoPaoDto> produtoPaoDto=produtoPao.stream()
				.map(produtoPaoMapperImpl::createModel)
				.collect(Collectors.toList());
		
		return produtoPaoDto;
	}
	
	public ProdutoPaoDto findById(Long id,ProdutoPaoDto produtoPaoDto) throws ProdutoPaoNotFoundException {
		
		 Optional<ProdutoPao> optionalById=produtoPaoRepository.findById(id);
		 ProdutoPao produtoPaobyId=optionalById.get();
//		 ProdutoPaoMapperImpl produtoPaoMapperImplById=new ProdutoPaoMapperImpl();
//		 ProdutoPaoDto produtoPaoDtoById=produtoPaoMapperImplById.createModel(produtoPaobyId);
		 

         produtoPaoDto.setId(produtoPaobyId.getId());
	     produtoPaoDto.setNome(produtoPaobyId.getNome());
	     produtoPaoDto.setMarca(produtoPaobyId.getMarca());
	     produtoPaoDto.setQtd(produtoPaobyId.getQtd());
	     produtoPaoDto.setMax(produtoPaobyId.getMax());
	     produtoPaoDto.setTipo(produtoPaobyId.getTipo());
		
	   return produtoPaoDto;
		
	}
	
		
	public ProdutoPaoDto atualizarDto(Long id,ProdutoPaoDto paoAtual) throws ProdutoPaoNotFoundException {
		
	    Optional<ProdutoPao> optionalPao=produtoPaoRepository.findById(id);
	    ProdutoPao paoOptionalById=optionalPao.get();
	    
    ProdutoPaoMapperImpl produtoPaoMapperImplAtualizado=new ProdutoPaoMapperImpl();
    
	    paoOptionalById.setNome(paoAtual.getNome());
	    paoOptionalById.setMarca(paoAtual.getMarca());
	    paoOptionalById.setQtd(paoAtual.getQtd());
	    paoOptionalById.setMax(paoAtual.getMax());
	    paoOptionalById.setTipo(paoAtual.getTipo());
	    
	    ProdutoPao save=produtoPaoRepository.save( paoOptionalById);
		    
	    return produtoPaoMapperImplAtualizado.createModel(save) ;
		}
	
	public ProdutoPaoDto deletarPao(Long id) {
		
		Optional<ProdutoPao> excluido=produtoPaoRepository.findById(id);
		ProdutoPao produtoExcluido=excluido.get();
		ProdutoPaoMapperImpl ImplExcluido=new ProdutoPaoMapperImpl();
		ProdutoPaoDto paoDtoExcluido=ImplExcluido.createModel(produtoExcluido);
		
		produtoPaoRepository.deleteById(id);
		
		return paoDtoExcluido;
		
	    }
	
	  public ProdutoPaoDto increment(Long id, int qtdIncrementado) throws EstoqueProdutoPaoException {
		  
		  ProdutoPaoMapperImpl ImplIncrementado=new ProdutoPaoMapperImpl();
		  Optional<ProdutoPao> produtoPaoIncrementadoOptional=produtoPaoRepository.findById(id);
		  ProdutoPao produtoPaoIncrementado = produtoPaoIncrementadoOptional.get();
	            int qtdTotal = produtoPaoIncrementado.getQtd()+qtdIncrementado;
	        
	        	if(qtdTotal<=produtoPaoIncrementado.getMax()) {
	        		
	        	produtoPaoIncrementado.setQtd(qtdTotal);
	        	}
	        	
        	   	else {
        	   		
	        	 throw new EstoqueProdutoPaoException(id,qtdIncrementado);
	        	}
	        	
	        	ProdutoPao saveProdutoPaoIncrementado = produtoPaoRepository.save(produtoPaoIncrementado);
	        	
	       return  ImplIncrementado.createModel(saveProdutoPaoIncrementado);
	        
	    }
		
	}
