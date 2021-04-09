package mercado_api_master.estoquePao.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import mercado_api_master.estoquePao.dto.ProdutoPaoDto;
import mercado_api_master.estoquePao.exception.ProdutoPaoAlreadyRegisteredException;
import mercado_api_master.estoquePao.exception.ProdutoPaoNotFoundException;

@Api("Estoque Pao")
public interface ProdutoPaoControllerDoc {
	@ApiOperation(value="Pão criado " )
    @ApiResponses(value= {
	        @ApiResponse(code = 201,message="Pão encontrado com sucesso"),
	        @ApiResponse(code=401,message="A solicitação não foi encontrada!")}
    )
	ProdutoPaoDto createProdutoPaoDto(ProdutoPaoDto ProdutopaoDto) throws ProdutoPaoAlreadyRegisteredException ;
	
//	@ApiOperation(value="Retorna o nome do Pao ")
//    @ApiResponses(value= {
//	        @ApiResponse(code = 200,message="Sucesso!"),
//	        @ApiResponse(code=404,message=" ERRO grave!")})
//    
//	ProdutoPaoDto findByName(@PathVariable String nome)  throws ProdutoPaoNotFoundException;
//	
	@ApiOperation(value="Lista de paes" )
    @ApiResponses(value= {
	        @ApiResponse(code = 200,message="Sucesso!"),})
 List<ProdutoPaoDto> findAll() throws ProdutoPaoNotFoundException;
	
		
	@ApiOperation(value=" " )
    @ApiResponses(value= {
	        @ApiResponse(code = 204,message="Sucesso!"),
	        @ApiResponse(code=404,message="ERRO grave!")})
	public ProdutoPaoDto deletarPao(@PathVariable Long id);
	
	
	

}
