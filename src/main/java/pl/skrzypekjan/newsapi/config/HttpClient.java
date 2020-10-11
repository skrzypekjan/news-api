package pl.skrzypekjan.newsapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import pl.skrzypekjan.newsapi.model.Article;
import pl.skrzypekjan.newsapi.model.Root;

import java.util.List;
import java.util.Objects;

@Service
public class HttpClient {

    private RestTemplate restTemplate;

    public HttpClient(){
        restTemplate = new RestTemplate();
    }

    public List<Article> getArticleList() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        String baseUrl = "https://newsapi.org/v2/top-headlines?sources=bbc-news";
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .queryParam("apiKey", "")
                .queryParam("pageSize", "6");

        HttpEntity<Root> response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                new HttpEntity<>(headers),
                Root.class
        );
        return Objects.requireNonNull(response.getBody()).getArticles();
    }
}
