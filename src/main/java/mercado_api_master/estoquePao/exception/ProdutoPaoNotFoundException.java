package mercado_api_master.estoquePao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProdutoPaoNotFoundException extends Exception {
		private static final long serialVersionUID = 1L;
		public ProdutoPaoNotFoundException(Long id) {
			super(String.format(" %", id));
		}
		public ProdutoPaoNotFoundException(String nome) {
		super(String.format(" %",nome));
	}



	}



