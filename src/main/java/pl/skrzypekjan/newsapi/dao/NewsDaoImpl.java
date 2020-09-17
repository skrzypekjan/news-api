package pl.skrzypekjan.newsapi.dao;

import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import pl.skrzypekjan.newsapi.config.HttpClient;
import pl.skrzypekjan.newsapi.model.Article;
import pl.skrzypekjan.newsapi.model.News;


import java.util.ArrayList;
import java.util.List;


@Controller
public class NewsDaoImpl implements NewsDao {

    RestTemplate restTemplate = new RestTemplate();
    HttpClient httpClient = new HttpClient();
    List<Article> articles = new ArrayList<>();

    public NewsDaoImpl() {
        String forObject = restTemplate.getForObject("https://newsapi.org/v2/everything?q=bitcoin&apiKey=31f027f7f6a6417da958fe7afe3a0944",
                String.class);
        System.out.println(forObject);
        System.out.println(httpClient.getArticleList());
    }

    @Override
    public List<News> getNews() {
        return null;
    }

    @Override
    public void saveNews() {

    }

}
