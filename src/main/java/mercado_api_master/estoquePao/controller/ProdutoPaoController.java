package mercado_api_master.estoquePao.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import mercado_api_master.estoquePao.dto.ProdutoPaoDto;
import mercado_api_master.estoquePao.exception.EstoqueProdutoPaoException;
import mercado_api_master.estoquePao.exception.ProdutoPaoAlreadyRegisteredException;
import mercado_api_master.estoquePao.exception.ProdutoPaoNotFoundException;
import mercado_api_master.estoquePao.service.ProdutoPaoService;

    @RestController
    @RequestMapping("/api/paes")
    public class ProdutoPaoController implements ProdutoPaoControllerDoc  {
    	
    @Autowired
   	private ProdutoPaoService produtoPaoService;
    	
	@GetMapping("/{id}")
	public ProdutoPaoDto findName(@PathVariable Long id, ProdutoPaoDto forDtoById) throws ProdutoPaoNotFoundException {
		
		return produtoPaoService.findById(id, forDtoById);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ProdutoPaoDto createProdutoPaoDto(@RequestBody ProdutoPaoDto produtoPaoDto) throws ProdutoPaoAlreadyRegisteredException {
		
	return  produtoPaoService.createDto(produtoPaoDto);
	
	}
	
	@GetMapping()
    public List<ProdutoPaoDto> findAll() throws ProdutoPaoNotFoundException {
		
	 return produtoPaoService.findAllPao();
	 
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ProdutoPaoDto atualizarPao(@PathVariable Long id, @RequestBody ProdutoPaoDto produtoPaoDtoAtual) throws ProdutoPaoNotFoundException {
		return produtoPaoService.atualizarDto(id,produtoPaoDtoAtual);
		
	}
	
	@PatchMapping("/{id}/aumento")
	public ProdutoPaoDto increment(@PathVariable Long id, @RequestBody @Valid ProdutoPaoDto qtdDTO) throws EstoqueProdutoPaoException {
		
	    return produtoPaoService.increment(id, qtdDTO.getQtd());
	    
	    }
		
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ProdutoPaoDto deletarPao(@PathVariable Long id) {
		
		return produtoPaoService.deletarPao(id);
	}



}
