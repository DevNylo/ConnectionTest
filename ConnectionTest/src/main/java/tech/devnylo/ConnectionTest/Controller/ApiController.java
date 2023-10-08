package tech.devnylo.ConnectionTest.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.devnylo.ConnectionTest.Services.ApiService;

@RestController
public class ApiController {
    private final ApiService apiService;

    @Autowired
    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/api-data")
    public String getApiData() {
        return apiService.fetchDataFromApi();
    }
}