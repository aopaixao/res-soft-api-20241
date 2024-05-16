
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import RestApiDto;

@Service
public class ClientRestService {
	public RestApiDto consultaCnpj(String cnpj) {
		RestTemplate restTemplate = new RestTemplate();
		String uri = "https://receitaws.com.br/v1/cnpj/{cnpj}";
		
		Map<String,String> params = new HashMap<String,String>();
		
		params.put("cnpj", cnpj);
		
		RestApiDto dto = restTemplate.getForObject(uri, RestApiDto.class, params);
		
		return dto;
	}	
}