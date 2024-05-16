
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/qualquer") 
public class QualquerController {
	
	@Autowired
	QualquerService qualquerService;

	@PostMapping
	public ResponseEntity<QualquerEntidade> save(@Valid @RequestBody QualquerEntidade entidade) {
		return new ResponseEntity<>(qualquerService.save(entidade), HttpStatus.CREATED);
	}
	
}
