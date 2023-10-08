package tech.devnylo.ConnectionTest.Services;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImplement implements ApiService {
    private final RestTemplate restTemplate;

    public ApiServiceImplement(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String fetchDataFromApi() {
        String apiUrl = "https://jsonplaceholder.typicode.com/todos/1";
        return restTemplate.getForObject(apiUrl, String.class);
    }
}