import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.biblioteca.dtos.PerfilResumidoDto;
import br.org.serratec.biblioteca.entities.Perfil;
import br.org.serratec.biblioteca.exceptions.EntidadeNotFoundException;
import br.org.serratec.biblioteca.repositories.PerfilRepository;

@Service
public class PerfilService {

	@Autowired
	PerfilRepository perfilRepository;
	
	@Autowired
    private ModelMapper modelMapper;

	public Perfil findById(Integer id) {
		//return perfilRepository.findById(id).orElse(null);
		//return perfilRepository.findById(id).get();
		return perfilRepository.findById(id).orElseThrow(
				() -> new EntidadeNotFoundException
						("Não foi encontrado um Perfil com o id " + id)
				);
	}
}
