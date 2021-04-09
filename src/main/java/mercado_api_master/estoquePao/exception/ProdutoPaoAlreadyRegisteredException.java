package mercado_api_master.estoquePao.exception;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProdutoPaoAlreadyRegisteredException extends Exception {
	
	private static final long serialVersionUID = 1L;

//	
//	public ProdutoPaoAlreadyRegisteredException(String  nome) {
//	super(String.format(" %", nome));
//}

}
