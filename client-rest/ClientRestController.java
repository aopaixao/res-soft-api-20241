
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ClientRestService;

@RestController
@RequestMapping("/client-rest") 
public class ClientRestController {
	
	@Autowired
	ClientRestService clientRestService;

	@GetMapping("/consulta-cnpj/{cnpj}")
	public ResponseEntity<RestApiDto> consultaCnpj(@PathVariable String cnpj) {
		
		return new 
				ResponseEntity<>(clientRestService.consultaCnpj(cnpj), HttpStatus.OK);
		
	}
	
}
